@extends('layouts.femaster')


@section('content')
    <div class="container">
        <br>
        <h2>Adicionar Bandas</h2>
        <br>


        <form method="POST" action="{{ route('bandas.create') }}">
            @csrf
            <div class="mb-3">
                <label for="exampleFormControlInput1" class="form-label">Nome</label>
                <input type="text" value="{{ old('nome') }}" name="nome" class="form-control"
                    id="exampleFormControlInput1" placeholder="Nome" required>
                @error('nome')
                    <div class='alert alert-danger'>
                        Banda inválida
                    </div>
                @enderror
            </div>
            <div class="mb-3">
                <label for="exampleFormControlInput1" class="form-label">Foto</label>
                <input type="file" value="{{ old('foto') }}" name = "foto" class="form-control"
                    id="exampleFormControlInput1">
            </div>

            <button type="submit" class="btn btn-primary">Enviar</button>
        </form>
        <br>
        <a class= "btn btn-success" href="{{ route('bandas.all') }}">Voltar</a>
        <br>
        <br>

    </div>
@endsection
