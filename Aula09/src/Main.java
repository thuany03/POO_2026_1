void main() {

    Aluno a1 = new Aluno("12345678", "Thuany", "thuthu11");
    Aluno a2 = new Aluno("12345679", "Tuuany", "thuthu22");


    Professor p1 = new Professor("12345", "Thuani","12345", "12345678", 12,40);
    Professor p2 = new Professor("12346", "Thuane","12346", "12345679", 18,40);

    Profissional[] p = new Profissional[2];
    p[0] = p1;
    p[1] = p2;

    Autenticavel a = p1;

    System.out.println(a.autenticar("12345678"));

    Notificavel[] n = new Notificavel[4];
    n[0] = a1;
    n[1] = a2;
    n[2] = p1;
    n[3] = p2;

    for(Notificavel not : n) {

        not.notificar("Olá!");
        not.notificarUrgente("FOGO!");
    }

}
