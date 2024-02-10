@extends('layouts.femaster')


@section('content')
   <h1>Dashboard </h1>

   <br><br>
@auth
<h1> Olá, {{ Auth::user()->name }}</h1>
@endauth
<br><br>

@if($isAdmin)
<div class="alert alert-primary" role="alert">
    Conta de Administrador
</div>
@endif


@endsection
