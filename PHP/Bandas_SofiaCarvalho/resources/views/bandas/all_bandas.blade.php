@extends('layouts.femaster')

@section('content')
    <br>
    <br>
    <h3>BANDAS</h3>
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
                <th scope="col">Nome</th>
                <th scope="col">Foto</th>
                <th scope="col" class="text-center">Quantidade Albuns</th>
                <th></th>
                <th></th>
                <th></th>
            </tr>
        </thead>
        <tbody>
            @foreach ($bandas as $index => $item)
                <tr>
                    <th scope='row'>{{ $index + 1 }}</th>
                    <td>{{ $item->nome }}</td>
                    <td><img src = "{{ $item->foto }}" alt="Imagem da Banda" style="width: 150px; height: 100px;"></td>
                    @if (isset($quantAlbuns[$index]))
                        <td class="text-center">{{ $quantAlbuns[$index]->qtAlbuns }}</td>
                    @else
                        <td class="text-center">0</td>
                    @endif
                    <td><a href="{{ route('bandas.view', $item->id) }}" class="btn btn-secondary"><i
                                class="bi bi-eye-fill"></i> Ver</a></td>
                    @auth
                        <td><a href="{{ route('bandas.verUpdate', $item->id) }}" class="btn btn-secondary"><i
                                    class="bi bi-pencil-fill"></i> Editar</a></td>
                        @if (Auth::user()->user_type == 1)
                            <td><a href="{{ route('bandas.delete', $item->id) }}" class="btn btn-danger"> <i
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
            <a href="{{ route('bandas.add', $item->id) }}" class="btn btn-info">Inserir banda</a></td>
        @endif
    @endauth
@endsection
