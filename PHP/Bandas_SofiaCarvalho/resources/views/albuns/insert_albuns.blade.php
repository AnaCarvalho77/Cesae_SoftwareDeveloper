@extends('layouts.femaster')


@section('content')
    <div class="container">
        <br>
        <h2>Adicionar Albuns</h2>
        <br>


        <form method="POST" action="{{ route('albuns.create') }}">
            @csrf
            <div class="mb-3">
                <label for="exampleFormControlInput1" class="form-label">Album</label>
                <input type="text" value="{{ old('nome') }}" name="nome" class="form-control"
                    id="exampleFormControlInput1" placeholder="Nome" required>
                @error('nome')
                    <div class='alert alert-danger'>
                        Album inválido
                    </div>
                @enderror
            </div>
            <div class="mb-3">
                <label for="exampleFormControlInput1" class="form-label">Imagem</label>
                <input type="file" value="{{ old('imagem') }}" name = "imagem" class="form-control"
                    id="exampleFormControlInput1">
            </div>

            <button type="submit" class="btn btn-primary">Enviar</button>
        </form>
        <br>
        <a class= "btn btn-success" href="{{ route('albuns.all') }}">Voltar</a>
        <br>
        <br>

    </div>
@endsection
