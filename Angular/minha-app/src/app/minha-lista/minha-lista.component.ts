import { Component } from '@angular/core';
import { MinhaListaItemComponent } from '../minha-lista-item/minha-lista-item.component';

@Component({
  selector: 'app-minha-lista',
  standalone: true,
  imports: [MinhaListaItemComponent],
  templateUrl: './minha-lista.component.html',
  styleUrl: './minha-lista.component.scss'
})
export class MinhaListaComponent {
  cidades:Array<{nome: string,pais: string,populacao: number}>=[
      {nome:'Porto', pais:'Portugal', populacao:78450},
      {nome:'Aveiro', pais:'Portugal', populacao:181494},
      {nome:'Barcelona', pais:'Espanha', populacao:1620343},
      {nome:'Paris', pais:'França', populacao:2148271},
      {nome:'Berlim', pais:'Alemanha', populacao:3645000},
  ];

}
