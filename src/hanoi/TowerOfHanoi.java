/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hanoi;

import java.util.Arrays;
import java.util.Stack;

/**
 *
 * @author gsilvae
 */
public class TowerOfHanoi {
   
    private Stack towers[] = new Stack[3];
    
    public TowerOfHanoi(int[] discs) {
        this.towers[0] = new Stack();
        this.towers[1] = new Stack();
        this.towers[2] = new Stack();
        this.fillStack(0, discs);
    }
    
    public void solve() {
        Stack lastT = this.towers[2];
        int numberOfDiscs = this.towers[0].size();
        boolean isEven = numberOfDiscs % 2 == 0;
        if(isEven) {
            while(true) {
                legalMove(0, 1);
                legalMove(0, 2);
                if(lastT.size() == numberOfDiscs)
                    break;
                legalMove(1, 2);
                if(lastT.size() == numberOfDiscs)
                    break;
            }
        } else { // is odd
            while(true) {
                legalMove(0, 2);
                if(lastT.size() == numberOfDiscs)
                    break;
                legalMove(0, 1);
                legalMove(1, 2);
                if(lastT.size() == numberOfDiscs)
                    break;
            }
        }
    }
    
    public void legalMove(int tower1, int tower2) {
        Stack s1 = this.towers[tower1];
        Stack s2 = this.towers[tower2];
        if(s1.isEmpty() && s2.isEmpty()) {
            return;
        }
        if(s1.empty()) {
            this.moveFromXToY(tower2, tower1);
            return;
        }
        if(s2.isEmpty()) {
            this.moveFromXToY(tower1, tower2);
            return;
        }
        int disc1 = (int) s1.peek();
        int disc2 = (int) s2.peek();
        if(disc1 < disc2) {
            this.moveFromXToY(tower1, tower2);
        } else {
            this.moveFromXToY(tower2, tower1);
        }
    }

    public void moveFromXToY(int x, int y) {
        Stack xT = this.towers[x];
        Stack yT = this.towers[y];
        yT.push(xT.pop());
    }
    
    @Override
    public String toString() {
        String str = "";
        for(int i=0; i<3; i++) {
            str += this.towers[i].toString() + '\n';
        }
        return str;
    }

    public void setTower0(int[] discs) {
        this.fillStack(0, discs);
    }

    public void setTower1(int[] discs) {
        this.fillStack(1, discs);
    }

    public void setTower2(int[] discs) {
        this.fillStack(2, discs);
    }
    
    private void fillStack(int towerIndx, int[] discs) {
        this.towers[towerIndx] = new Stack(); // delete all
        for(int i=0; i<discs.length; i++) {
            this.towers[towerIndx].push(discs[i]);
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TowerOfHanoi other = (TowerOfHanoi) obj;
        if (!Arrays.deepEquals(this.towers, other.towers)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Arrays.deepHashCode(this.towers);
        return hash;
    }
    
}
