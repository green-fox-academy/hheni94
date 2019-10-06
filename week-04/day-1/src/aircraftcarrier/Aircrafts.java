package aircraftcarrier;

public class Aircrafts {
  private String type;
  private int currentAmmmo;
  private int baseDamage;
  private int maxAmmo;

  public Aircrafts() {
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public int getCurrentAmmo() {
    return currentAmmmo;
  }

  public void setCurrentAmmo(int currentAmmmo) {
    this.currentAmmmo = currentAmmmo;
  }

  public void setBaseDamage(int baseDamage) {
    this.baseDamage = baseDamage;
  }

  public void setMaxAmmo(int maxAmmo) {
    this.maxAmmo = maxAmmo;
  }

  public String getStatus() {
    return "Type " + this.type + " , Ammo: " + currentAmmmo + " , Base Damage: " + baseDamage + " , All Damage: " + (currentAmmmo * baseDamage);
  }

  public boolean isPriority() {
    if (this.type.equals("F35")) {
      return true;
    } else {
      return false;
    }
  }

  public int fight() {
    int allDamage = 0;
    allDamage = currentAmmmo * baseDamage;
    currentAmmmo = 0;
    return allDamage;
  }

  public int refill(int number) {
    int remainAmmo = 0;
    int neddedAmount = maxAmmo - currentAmmmo;
    if (neddedAmount <= number) {
      currentAmmmo = maxAmmo;
      remainAmmo = number - neddedAmount;
    } else {
      currentAmmmo += number;
    }
    number = remainAmmo;
    return number;
  }
}
