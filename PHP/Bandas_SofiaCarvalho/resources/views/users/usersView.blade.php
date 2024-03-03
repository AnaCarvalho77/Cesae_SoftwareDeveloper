@extends('layouts.femaster')

@section('content')
    <h1>Ver dados {{ $myUser->name }}</h1>
    <form method="POST">
        @csrf
        <input type="hidden" name="id" value="{{ $myUser->id }}" id="">
        <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">Nome</label>
            <input type="text" value="{{ $myUser->name }}" class="form-control" id="exampleFormControlInput1" readonly>
        </div>
        <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">Email</label>
            <input type="email" value="{{ $myUser->email }}" class="form-control" id="exampleFormControlInput1" readonly>
        </div>
        <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">Morada</label>
            <input type="text" value="{{ $myUser->address }}" class="form-control" id="exampleFormControlInput1"
                readonly>
        </div>
        <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">Telefone</label>
            <input type="text" value="{{ $myUser->phone }}" class="form-control" id="exampleFormControlInput1" readonly>
        </div>
    </form>

    <a class= "btn btn-success" href="{{ route('users.all') }}">Voltar</a>
    @auth
        <a href="{{ route('users.verUpdate', ['id' => $myUser->id]) }}" class="btn btn-info">Editar</a>
    @endauth
@endsection
