package br.calebe.ticketmachine.core;



/**
 *
 * @author Calebe de Paula Bianchini
 */
class Troco {

    protected PapelMoeda[] papeisMoeda;

    public Troco(int valor) {
        papeisMoeda = new PapelMoeda[7];
        int count = 0;
        while (valor % 100 != 0 && valor >= 100) {
            count++;
            valor -= 100;
        }
        papeisMoeda[6] = new PapelMoeda(100, count);
        count = 0;
        while (valor % 50 != 0 && valor >= 50) {
            count++;
            valor -= 50;
        }
        papeisMoeda[5] = new PapelMoeda(50, count);
        count = 0;
        while (valor % 20 != 0 && valor >= 20) {
            count++;
            valor -= 20;
        }
        papeisMoeda[4] = new PapelMoeda(20, count);
        count = 0;
        while (valor % 10 != 0 && valor >= 10) {
            count++;
            valor -= 10;
        }
        papeisMoeda[3] = new PapelMoeda(10, count);
        count = 0;
        while (valor % 5 == 0 && valor >= 5) {
            count++;
            valor -= 5;
        }
        papeisMoeda[2] = new PapelMoeda(5, count);
        count = 0;
        while (valor % 2 == 0 && valor >= 2) {
            count++;
            valor -= 2;
        }
        papeisMoeda[1] = new PapelMoeda(2, count);  
        count = 0;
        while (valor % 1 == 0 && valor >= 1) {
            count++;
            valor -= 1;
        }
         papeisMoeda[0] = new PapelMoeda(1, count);
    }
    
    public PapelMoeda[] getPapeisMoeda(){
        return this.papeisMoeda;
    }
    
    /*public Iterator<PapelMoeda> getIterator() {
        return new TrocoIterator(this);
    }

    class TrocoIterator implements Iterator<PapelMoeda> {

        protected Troco troco;

        public TrocoIterator(Troco troco) {
            this.troco = troco;
        }

        @Override
        public boolean hasNext() {
            for (int i = 5; i >= 0; i--) {
                if (troco.papeisMoeda[i] != null) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public PapelMoeda next() {
            PapelMoeda ret = new PapelMoeda(0, 0);
            for (int i = 5; i >= 0 && ret != null; i--) {
                if (troco.papeisMoeda[i] != null) {
                    ret = troco.papeisMoeda[i];
                    troco.papeisMoeda[i] = null;
                }
            }
            return ret;
        }

        @Override
        public void remove() {
            next();
        }
    }*/
}
