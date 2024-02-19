import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { ICidade } from '../models/cidade.model';

@Injectable({
  providedIn: 'root'
})
export class CidadesService {

  cidades: Array<ICidade> = [
    { id: 1,nome: 'Porto', pais: 'Portugal', populacao: 78450 },
    { id: 2 ,nome: 'Aveiro', pais: 'Portugal', populacao: 181494 },
    { id:3, nome: 'Barcelona', pais: 'Espanha', populacao: 1620343 },
    { id:4, nome: 'Paris', pais: 'França', populacao: 2148271 },
    { id: 5, nome: 'Berlim', pais: 'Alemanha', populacao: 3645000 },
  ];

  constructor(private http: HttpClient) { }


  limparDados():void{

  }

  reporDados():void{

  }

  create(novaCidade: ICidade): void {

  }

  readAll(): Observable <any> {
    return this.http.get('http://localhost:3000/cidades')

  }

  read(id: number): Observable <any> {
    return this.http.get('http://localhost:3000/cidades/' + id);


  }

  updtade(cidade: ICidade): void {



  }
  delete(cidade: ICidade): void {


  }
}
