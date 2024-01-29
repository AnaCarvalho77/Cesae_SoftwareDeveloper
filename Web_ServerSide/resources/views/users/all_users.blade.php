@extends('layouts.femaster')

@section('content')
    <h3>Olá, sou todos os users</h3>
    <br>
    <br>
    {{-- <p>{{ $hello }}</p>
    <p>{{ $helloAgain }}</p>
    <p>{{ $daysOfWeek[2] }}</p>
    <p>{{ $infoPodeNomeDiferente['name'] }}</p>
    <p>{{ $infoPodeNomeDiferente['modules'][0] }}</p>
    <p>{{ $infoPodeNomeDiferente[0][0] }}</p> --}}


    <table class="table">
        <thead>
          <tr>
            <th scope="col">#</th>
            <th scope="col">Name</th>
            <th scope="col">Phone</th>
            <th scope="col">Email</th>
            <th></th>
          </tr>
        </thead>
        <tbody>
            @foreach ($users as $item)
          <tr>
            <th scope='row'>{{ $item->id }}</th>
            <td>{{ $item->name }}</td>
            <td>{{ $item->phone }}</td>
            <td>{{ $item->email }}</td>
            <td><a href="{{route('users.view', $item->id)}}" class="btn btn-info">Ver</a></td>

          </tr>
          @endforeach
        </tbody>
      </table>

@endsection
