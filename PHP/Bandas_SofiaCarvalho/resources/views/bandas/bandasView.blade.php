@extends('layouts.femaster')

@section('content')
    <form method="POST">
        @csrf
        <input type="hidden" name="id" value="{{ $myBanda->id }}" id="">
        <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">Nome</label>
            <input type="text" value="{{ $myBanda->nome }}" name="nome" class="form-control"
                id="exampleFormControlInput1" placeholder="Nome" readonly>
        </div>
        <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">Foto</label>
            <input type="text" value="{{ $myBanda->foto }}" name = "foto" class="form-control"
                id="exampleFormControlInput1" readonly>
        </div>
    </form>
    <br>
    <a class= "btn btn-success" href="{{ route('bandas.all') }}">Voltar</a>
    @auth
        <a href="{{ route('bandas.verUpdate', ['id' => $myBanda->id]) }}" class="btn btn-info">Editar</a>
    @endauth
@endsection
