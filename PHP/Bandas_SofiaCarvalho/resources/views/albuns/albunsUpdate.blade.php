@extends('layouts.femaster')

@section('content')
    <form method="POST" action="{{ route('albuns.update') }}">
        @csrf
        <input type="hidden" name="id" value="{{ $myAlbum->id }}" id="">
        <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">Nome Album</label>
            <input type="text" value="{{ $myAlbum->nome }}" name="nome" class="form-control"
                id="exampleFormControlInput1" placeholder="Nome" required>
            @error('nome')
                <div class='alert alert-danger'>
                    Album inválido
                </div>
            @enderror
        </div>
        <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">Imagem</label>
            <input type="text" value="{{ $myAlbum->imagem }}" name = "imagem" class="form-control"
                id="exampleFormControlInput1">
        </div>
        <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">Data Lançamento</label>
            <input type="text" value="{{ $myAlbum->data_lancamento }}" name = "data_lancamento" class="form-control"
                id="exampleFormControlInput1">
        </div>
        <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">Banda</label>
            <select name="banda_id" id="">
                <option value="">Selecionar uma Banda</option>
                @foreach ($bandas as $banda)
                    <option @if ($banda->id == $myAlbum->banda_id) selected @endif value="{{ $banda->id }}">
                        {{ $banda->nome }}</option>
                @endforeach
            </select>
        </div>

        <button type="submit" class="btn btn-primary">Atualizar</button>
    </form>
    <br>
    <a class= "btn btn-success" href="{{ route('albuns.all') }}">Voltar</a>
    <br>
@endsection
