import { HttpClientModule } from '@angular/common/http';
import { Component } from '@angular/core';
import { FormBuilder, FormGroup, FormGroupDirective, FormsModule, NgModel, NgModelGroup, ReactiveFormsModule, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { ICidade } from '../models/cidade.model';
import { CidadesService } from '../services/cidades-api.service';


@Component({
  selector: 'app-form-api',
  standalone: true,
  imports: [HttpClientModule, ReactiveFormsModule],
  providers: [CidadesService],
  templateUrl: './form-api.component.html',
  styleUrl: './form-api.component.scss'
})
export class FormApiComponent {

  form: FormGroup;

  minhaCidade: ICidade = {
    id: "",
    nome: "",
    pais: "",
    populacao: 0 //podemos não colocar porque não é um parametro obrigatorio
  }

  constructor(
    private cidadesService: CidadesService,
    private route: ActivatedRoute,
    private formBuilder:FormBuilder,
    private router: Router,
     ) {
      this.form = formBuilder.group({
        nome: ['', Validators.required],
        pais:['', Validators.required],
        populacao:[0, Validators.min(1000)]
      })
  }

  ngOnInit() {
    this.minhaCidade.id = this.route.snapshot.paramMap.get('id') ?? '';
    console.log('id:', this.minhaCidade.id);

    if (this.minhaCidade.id) {
      this.cidadesService.read(this.minhaCidade.id).subscribe((cidade) => {
        console.log(cidade)

        this.minhaCidade = cidade;
          this.form.controls['nome'].setValue(cidade.nome);
          this.form.controls['pais'].setValue(cidade.pais);
          this.form.controls['populacao'].setValue(cidade.populacao);

      })
    }
  }

  formSubmit(){
    console.log('if', this.form.invalid)
    if( this.form.invalid){
      //nao vou fazer nada
    }else{
      console.log('id', this.minhaCidade.id)
      //editar cidade
      if(this.minhaCidade.id){
        this.cidadesService.updtade({
          id: this.minhaCidade.id,
          nome: this.form.controls['nome'].getRawValue(),
          pais: this.form.controls['pais'].getRawValue(),
          populacao: this.form.controls['populacao'].getRawValue()
        }).subscribe({
          next: (data) => {
            console.log('foi editado');
            this.router.navigate(['/minha-lista'])
          },
          error: (error) => {
            console.error('não foi editado')

          }
      });
      }else{
        //ou criar cidade
        this.cidadesService.create({
          nome: this.form.controls['nome'].getRawValue(),
          pais: this.form.controls['pais'].getRawValue(),
          populacao: this.form.controls['populacao'].getRawValue()
        }).subscribe({
          next: (data) => {
            console.log('foi criado');
            this.router.navigate(['/minha-lista'])
          },
          error: (error) => {
            console.error('não foi criado')
            alert('errpo ao criar')

          }
        })

      }

    }


  }

}
