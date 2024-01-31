import { Component } from '@angular/core';
import { ListaAnimaisItemComponent } from '../lista-animais-item/lista-animais-item.component';


@Component({
  selector: 'app-lista-animais',
  standalone: true,
  imports: [ListaAnimaisItemComponent],
  templateUrl: './lista-animais.component.html',
  styleUrl: './lista-animais.component.scss'
})
export class ListaAnimaisComponent {
  animais:Array<{nome: string,especie: string,raca: string,idade: number}>=[
    {nome:'Boby', especie:'cão',raca:'rafeiro', idade:4},
    {nome:'Tobias', especie:'macaco', raca:'rafeiro', idade:1},
    {nome:'Tareco', especie:'cão',raca:'simples',  idade:3},
    {nome:'Lucky', especie:'cão', raca:'cenas', idade:6},
    {nome:'Simão', especie:'gato',raca:'fofo',  idade:2},
  ]
}
