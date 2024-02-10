@extends('layouts.femaster')

@section('content')
    <h3>Olá, sou todos os users</h3>
    <br>
    <br>
    {{-- <p>{{ $hello }}</p>
    <p>{{ $helloAgain }}</p>
    <p>{{ $daysOfWeek[2] }}</p>
    <p>{{ $infoPodeNomeDiferente['name'] }}</p>
    <p>{{ $infoPodeNomeDiferente['modules'][0] }}</p>
    <p>{{ $infoPodeNomeDiferente[0][0] }}</p> --}}
    <form action="" method="GET">
        <input type="text" value="{{ request()->query('search') }}" name="search" id="" placeholder="Procurar">
        <button class = "btn btn-secondary" type="submit">Procurar</button>
    </form>

    @if (session('message'))
        <div class="alert alert-success">
            {{ session('message') }}
        </div>
    @endif


    <table class="table">
        <thead>
            <tr>
                <th scope="col">#</th>
                <th scope="col">Nome</th>
                <th scope="col">Morada</th>
                <th scope="col">Telefone</th>
                <th scope="col">Email</th>
                <th></th>
                <th></th>
            </tr>
        </thead>
        <tbody>
            @foreach ($users as $item)
                <tr>
                    <th scope='row'>{{ $item->id }}</th>
                    <td>{{ $item->name }}</td>
                    <td>{{ $item->address }}</td>
                    <td>{{ $item->phone }}</td>
                    <td>{{ $item->email }}</td>
                    @auth
                        <td><a href="{{ route('users.view', $item->id) }}" class="btn btn-info">Ver/Editar</a></td>
                        @if (Auth::user()->user_type == 1)
                            <td><a href="{{ route('users.delete', $item->id) }}" class="btn btn-danger">Apagar</a></td>
                        @endif
                    @endauth
                </tr>
            @endforeach
        </tbody>
    </table>
@endsection
