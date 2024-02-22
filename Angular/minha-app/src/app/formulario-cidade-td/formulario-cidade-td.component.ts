import { Component, NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { CidadesService } from '../services/cidades-ls.service';
import { ICidade } from '../models/cidade.model';
import { ActivatedRoute, Router } from '@angular/router';
import { CommonModule } from '@angular/common';



@Component({
  selector: 'app-formulario-cidade-td',
  standalone: true,
  imports: [FormsModule, CommonModule],
  templateUrl: './formulario-cidade-td.component.html',
  styleUrl: './formulario-cidade-td.component.scss'
})
export class FormularioCidadeTdComponent {

  minhaCidade:ICidade = {
    id:0,
    nome:"",
    pais:"",
    populacao:0 //podemos não colocar porque não é um parametro obrigatorio
  }

  constructor(
    private cidadeService: CidadesService,
     private router: Router,
     private route: ActivatedRoute ){
  }

  ngOnInit(){
    this.minhaCidade.id = parseInt(this.route.snapshot.paramMap.get('id') ?? '0');
    console.log('id:', this.minhaCidade.id);

    if(this.minhaCidade.id > 0 ){
     this.minhaCidade =  this.cidadeService.read(this.minhaCidade.id);
     console.log('cidade:', this.minhaCidade);

    }

    console.log('nome', this.minhaCidade.nome);

  }


  formSubmit(){
    console.log('nome',this.minhaCidade.nome);


    if(this.minhaCidade.id ){
      this.cidadeService.updtade(this.minhaCidade);
    }else{
      this.cidadeService.create(this.minhaCidade);
    }
    this.router.navigate(['/minha-lista']);//depois de submeter nova cidade no butao ok ir para a lista

  }


}
