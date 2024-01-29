import { Component } from '@angular/core';
import { RouterOutlet, RouterLink, RouterLinkActive } from '@angular/router';
import { RouterModule} from '@angular/router';


@Component({
  selector: 'app-segunda-pagina',
  standalone: true,
  imports: [RouterOutlet, RouterModule, RouterLink, RouterLinkActive],
  templateUrl: './segunda-pagina.component.html',
  styleUrl: './segunda-pagina.component.scss'
})
export class SegundaPaginaComponent {
  

}
