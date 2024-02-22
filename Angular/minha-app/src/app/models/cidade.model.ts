export interface ICidade {
  id?:number | string;
  nome: string;
  pais: string;
  populacao?: number; //deixa de ser obrigatório para a construção deste objecto como "?"

 }
