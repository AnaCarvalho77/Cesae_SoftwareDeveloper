import { Injectable } from '@angular/core';
import { ICidade } from '../models/cidade.model';

@Injectable({
  providedIn: 'root'
})
export class CidadesService {

  cidades: Array<ICidade> = [];

  constructor() {
    console.log('localStorage.getItem("cidades")', localStorage.getItem('cidades'))


    if (!localStorage.getItem('cidades')) {
     this.reporDados();

    } else {
      this.readAll();
    }
  }

  reporDados():void{
    let cidades: Array<ICidade> = [
      { id: 1, nome: 'Aveiro', pais: 'Portugal', populacao: 181494 },
      { id: 2, nome: 'Barcelona', pais: 'Espanha', populacao: 1620343 },
      { id: 3, nome: 'Porto', pais: 'Portugal', populacao: 78450 },
      { id: 4, nome: 'Paris', pais: 'França', populacao: 2148271 },
      { id: 5, nome: 'Berlim', pais: 'Alemanha', populacao: 3645000 },
    ];
    this.cidades = cidades;
    localStorage.setItem('cidades', JSON.stringify(cidades));

  }

  limparDados(): void {
    // localStorage.clear();
    localStorage.removeItem('cidades');
    this.cidades = [];

    this.reporDados();


  }

  create(novaCidade: ICidade): void {
    /*   let maxID: number = this.cidades.reduce(
        (maxID,item) => {
          maxID => item.id

        }
      );*/

    /*   let maxID: number = 0;
      this.cidades.forEach(item) => {
        if(maxID < item.id){
          maxID = item.id;
        }
      } */

 /*      const max: ICidade = this.cidades.reduce(
        function name(max: ICidade, item: ICidade): ICidade{
          if(max.id > item.id){
            return max;
          }else{
            return item;
          }
        }
      ); faz o mesmo do que está abaixo*/

      const maxID: ICidade = this.cidades.reduce(
        (max, item)=> (max.id || 0) > (item.id || 0) ? max : item);

        novaCidade.id = maxID.id || 0 + 1;

      this.cidades.push(novaCidade);
      localStorage.setItem('cidades', JSON.stringify(this.cidades));

      console.log(this.cidades);


  }

  readAll(): void {
    let cidades: Array<ICidade> = JSON.parse(localStorage.getItem('cidades') || '')
    this.cidades = cidades;
  }

  read(id: number): ICidade {
    return this.cidades.filter((x:ICidade) => x.id === id)[0];

  }

  updtade(cidade: ICidade): void {
    let index: number = this.cidades.findIndex((x:ICidade) => x.id === cidade.id);
    this.cidades[index] = cidade;

    localStorage.setItem('cidades', JSON.stringify(this.cidades) );


  }
  delete(cidade: ICidade): void {
    let index: number = this.cidades.findIndex((x:ICidade) => x.id === cidade.id);
    this.cidades.splice(index,1);

    localStorage.setItem('cidades', JSON.stringify(this.cidades));

  }
}
