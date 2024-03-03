@extends('layouts.femaster')

@section('content')
    <br>
    <br>
    <h3>ALBUNS</h3>
    <br>
    <br>
    @if (session('message'))
        <div class="alert alert-success">
            {{ session('message') }}
        </div>
    @endif


    <table class="table">
        <thead>
            <tr>
                <th scope="col">#</th>
                <th scope="col">Album</th>
                <th scope="col">Imagem</th>
                <th scope="col">Data de Lançamento</th>
                <th scope="col">Banda</th>
                <th></th>
                <th></th>
                <th></th>
            </tr>
        </thead>
        <tbody>
            @foreach ($albuns as $index => $item)
                <tr>
                    <th scope='row'>{{ $index + 1 }}</th>
                    <td>{{ $item->nome }}</td>
                    <td><img src="{{ $item->imagem }}" alt="Imagem do album" style="width: 150px; height: 100px;"></td>
                    <td>{{ $item->data_lancamento }}</td>
                    <td>{{ $item->bandaNome }}</td>
                    <td><a href="{{ route('albuns.view', $item->id) }}" class="btn btn-secondary"><i
                                class="bi bi-eye-fill"></i> Ver</a></td>
                    @auth
                        <td><a href="{{ route('albuns.verUpdate', $item->id) }}" class="btn btn-secondary"><i
                                    class="bi bi-pencil-fill"></i> Editar</a></td>
                        @if (Auth::user()->user_type == 1)
                            <td><a href="{{ route('albuns.delete', $item->id) }}" class="btn btn-danger"> <i
                                        class="bi bi-trash"></i> Eliminar</a></td>
                        @endif
                    @endauth
                </tr>
            @endforeach
        </tbody>
    </table>
    <a class= "btn btn-success" href="{{ route('home.index') }}">Voltar</a>

    @auth
        @if (Auth::user()->user_type == 1)
            <a href="{{ route('bandas.add', $item->id) }}" class="btn btn-info">Inserir album</a></td>
        @endif
    @endauth
@endsection
