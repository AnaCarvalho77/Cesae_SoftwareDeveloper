@extends('layouts.femaster')

@section('content')
    <br><br>
    <h1>Utilizadores</h1>
    <br>
    <br>
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
                    <td>{{ $item->email }}</td>
                    <td><a href="{{ route('users.view', $item->id) }}" class="btn btn-info">Ver</a></td>
                    @auth
                        <td><a href="{{ route('users.verUpdate', $item->id) }}" class="btn btn-info">Editar</a></td>
                        @if (Auth::user()->user_type == 1)
                            <td><a href="{{ route('users.delete', $item->id) }}" class="btn btn-danger">Apagar</a></td>
                        @endif
                    @endauth
                </tr>
            @endforeach
        </tbody>
    </table>
    <a class= "btn btn-success" href="{{ route('home.index') }}">Voltar</a>
    @auth
        @if (Auth::user()->user_type == 1)
            <a href="{{ route('users.add', $item->id) }}" class="btn btn-info">Inserir utilizador</a></td>
        @endif
    @endauth
@endsection
