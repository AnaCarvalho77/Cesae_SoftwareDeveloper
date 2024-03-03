@extends('layouts.femaster')

@section('content')
    <form method="POST">
        @csrf
        <input type="hidden" name="id" value="{{ $myAlbum->id }}" id="">
        <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">Album</label>
            <input type="text" value="{{ $myAlbum->nome }}" name="nome" class="form-control"
                id="exampleFormControlInput1" placeholder="Nome" readonly>
        </div>
        <div class="mb-3">
            @if ($myAlbum->imagem)
                <img src="{{ $myAlbum->imagem }}" alt="Imagem do álbum" style="width: 150px; height: 100px;"><br>
            @endif
            <label for="exampleFormControlInput1" class="form-label">Imagem</label>
            <input type="text" value="{{ $myAlbum->imagem }}" name="imagem" class="form-control"
                id="exampleFormControlInput1" readonly>
        </div>
        <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">Data Lançamento</label>
            <input type="text" value="{{ $myAlbum->data_lancamento }}" name = "data_lancamento" class="form-control"
                id="exampleFormControlInput1" readonly>
        </div>
        <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">Banda</label>
            <input type="text" value="{{ $myAlbum->bandaNome }}" name = "banda_id" class="form-control"
                id="exampleFormControlInput1" readonly>
        </div>
    </form>
    <br>
    <a class= "btn btn-success" href="{{ route('albuns.all') }}">Voltar</a>
    @auth
        <a href="{{ route('albuns.verUpdate', ['id' => $myAlbum->id]) }}" class="btn btn-info">Editar</a>
    @endauth
@endsection
