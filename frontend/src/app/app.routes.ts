import { Routes } from '@angular/router';
import {ClientsComponent} from './clients/clients.component';
import {CreditsComponent} from './credits/credits.component';

export const routes: Routes = [
  { path: 'clients', component: ClientsComponent },
  { path: 'credits', component: CreditsComponent },
  { path: '**', redirectTo: 'clients' }];
