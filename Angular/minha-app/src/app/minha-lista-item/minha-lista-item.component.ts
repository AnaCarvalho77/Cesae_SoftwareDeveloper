import { Component, Input } from '@angular/core';
import { RouterLink } from '@angular/router';
import { ICidade } from '../models/cidade.model';
import { CidadesService } from '../services/cidades-api.service';


@Component({
  selector: 'app-minha-lista-item',
  standalone: true,
  imports: [RouterLink],
  templateUrl: './minha-lista-item.component.html',
  styleUrl: './minha-lista-item.component.scss'
})
export class MinhaListaItemComponent {
  @Input({required: true}) cidade: ICidade = {id:0 ,nome:'', pais:'',populacao:0}

  constructor(private cidadesService : CidadesService){

  }

  del(){
    /* this.cidadesService.delete(this.cidade);
    console.log('aqui') */
    this.cidadesService.delete(this.cidade).subscribe({
      next: (data) => {
        //ok
      },
      error: (error) => {
        alert('erro ao eliminar a cidade: ' + this.cidade.nome)
      }
    })
  }

}

