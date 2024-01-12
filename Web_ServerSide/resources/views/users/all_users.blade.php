@extends('layouts.femaster')

@section('content')
    <h3>Olá, sou todos os users</h3>
    <p>{{ $hello }}</p>
    <p>{{ $helloAgain }}</p>
    <p>{{ $daysOfWeek[2] }}</p>
    <p>{{ $infoPodeNomeDiferente['name'] }}</p>
    <p>{{ $infoPodeNomeDiferente['modules'][0] }}</p>
    <p>{{ $infoPodeNomeDiferente[0][0] }}</p>


    <table class="table">
        <thead>
          <tr>
            <th scope="col">ID</th>
            <th scope="col">Name</th>
            <th scope="col">Phone</th>
            <th scope="col">Email</th>
          </tr>
        </thead>
        <tbody>
            @foreach ($contacts as $item)
          <tr>
            <td>{{ $item['id'] }}</td>
            <td>{{ $item['name'] }}</td>
            <td>{{ $item['phone'] }}</td>
            <td>{{ $item['email'] }}</td>
          </tr>
          @endforeach
        </tbody>
      </table>

@endsection
