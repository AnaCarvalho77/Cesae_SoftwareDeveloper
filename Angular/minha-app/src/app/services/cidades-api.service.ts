import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { ICidade } from '../models/cidade.model';

@Injectable({
  providedIn: 'root'
})
export class CidadesService {

  cidades: Array<ICidade> = [
    { id: "1", nome: 'Porto', pais: 'Portugal', populacao: 78450 },
    { id: "2", nome: 'Aveiro', pais: 'Portugal', populacao: 181494 },
    { id: "3", nome: 'Barcelona', pais: 'Espanha', populacao: 1620343 },
    { id: "4", nome: 'Paris', pais: 'França', populacao: 2148271 },
    { id: "5", nome: 'Berlim', pais: 'Alemanha', populacao: 3645000 },
  ];

  constructor(private http: HttpClient) { }


  limparDados(): void {
    this.reporDados()

  }

  reporDados(): void {
    let cidades: Array<ICidade> = [
      { nome: 'Aveiro', pais: 'Portugal', populacao: 181494 },
      { nome: 'Barcelona', pais: 'Espanha', populacao: 1620343 },
      { nome: 'Porto', pais: 'Portugal', populacao: 78450 },
      { nome: 'Paris', pais: 'França', populacao: 2148271 },
      { nome: 'Berlim', pais: 'Alemanha', populacao: 3645000 },
    ];

    cidades.forEach(cidade => {
      console.log('reporDados().forEach()');

      this.create(cidade).subscribe({
        next: (data) => {
          console.log('create cidade ok');
        },
        error: (error) => {
          console.error('create cidade error');
        },
      });
    });
  }

  create(novaCidade: ICidade): Observable<any> {
    return this.http.post('http://localhost:3000/cidades', novaCidade)

  }

  readAll(): Observable<any> {
    return this.http.get('http://localhost:3000/cidades')

  }

  read(id: string): Observable<any> {
    return this.http.get('http://localhost:3000/cidades/' + id);


  }

  updtade(cidade: ICidade): Observable<any> {
    return this.http.put('http://localhost:3000/cidades/' + cidade.id, cidade)


  }
  delete(cidade: ICidade): Observable<any> {
    return this.http.delete('http://localhost:3000/cidades/' + cidade.id)



  }
}
