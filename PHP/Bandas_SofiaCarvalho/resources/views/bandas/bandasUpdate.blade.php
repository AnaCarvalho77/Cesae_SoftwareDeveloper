@extends('layouts.femaster')

@section('content')
    <form method="POST" action="{{ route('bandas.update') }}">
        @csrf
        <input type="hidden" name="id" value="{{ $myBanda->id }}" id="">
        <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">Nome</label>
            <input type="text" value="{{ $myBanda->nome }}" name="nome" class="form-control"
                id="exampleFormControlInput1" placeholder="Nome" required>
            @error('nome')
                <div class='alert alert-danger'>
                    Banda inválida
                </div>
            @enderror
        </div>
        <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">Foto</label>
            <input type="text" value="{{ $myBanda->foto }}" name = "foto" class="form-control"
                id="exampleFormControlInput1">
        </div>

        <button type="submit" class="btn btn-primary">Atualizar</button>
    </form>
    <br>
    <a class= "btn btn-success" href="{{ route('bandas.all') }}">Voltar</a>
    <br>
@endsection
