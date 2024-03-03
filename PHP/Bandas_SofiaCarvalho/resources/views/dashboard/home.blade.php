@extends('layouts.femaster')


@section('content')
    <h1>Administrador(a)
        @auth
            {{ Auth::user()->name }}
        @endauth
    </h1>

    <br><br>
    @auth
        @if ($message)
            <div class="alert alert-primary" role="alert">
                Conta de Administrador
            </div>
        @endif
    @endauth
@endsection
