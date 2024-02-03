@extends('layouts.femaster')

@section('content')
<h1>Ver / Atualizar Dados {{$myUser->name}}</h1>
    {{-- <h1>Cucu, ver um user</h1>
    <br>
    <h4>Nome: {{$myUser->name}}</h4>
    <h4>Phone: {{$myUser->phone}}</h4>
    <h4>Address: {{$myUser->address}}</h4>
    <h4>Email: {{$myUser->email}}</h4>
    <h4>Pasword: {{$myUser->password}}</h4>
    <td><a href="{{route('users.view', $item->id)}}" class="btn btn-info">Ver</a></td> --}}

        <form method="POST" action="{{route('users.update')}}">
            @csrf {{-- Token para impedir o sql injection, não é necessário usar --}}
            <input type="hidden" name="id" value="{{$myUser->id}}" id="" >
            <div class="mb-3">
                <label for="exampleFormControlInput1" class="form-label">Nome</label>
                <input type="texto" value="{{$myUser->name}}" name="name" class="form-control" id="exampleFormControlInput1" placeholder="Nome" required>
                @error('name')
                <div class='alert alert-danger'>
                    O nome que colocou é inválido!
                </div>
                @enderror
              </div>
              <div class="mb-3">
                <label for="exampleFormControlInput1" class="form-label">Email</label>
                <input disabled type="email"  value="{{$myUser->email}}" name = "email" class="form-control" id="exampleFormControlInput1" placeholder="email@exemplo.com" required>
                @error('email')
                <div class='alert alert-danger'>
                    Este email já está registado!
                </div>
                @enderror
              </div>
              <div class="mb-3">
                <label for="exampleFormControlInput1" class="form-label">Morada</label>
                <input type="address"  value="{{$myUser->address}}" name = "address" class="form-control" id="exampleFormControlInput1" >
                @error('address')
                <div class='alert alert-danger'>
                    Morada incorrecta!
                </div>
                @enderror
              </div>
              <div class="mb-3">
                <label for="exampleFormControlInput1" class="form-label">Telefone</label>
                <input type="phone"  value="{{$myUser->phone}}" name = "phone" class="form-control" id="exampleFormControlInput1">
                @error('phone')
                <div class='alert alert-danger'>
                    Telefone incorrecto!
                </div>
                @enderror
              </div>

              <button type="submit" class="btn btn-primary">Atualizar</button>
        </form>

@endsection
