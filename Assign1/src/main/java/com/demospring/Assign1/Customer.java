package com.demospring.Assign1;

public class Customer {
  private String name;

  private int cid;

  private long contact;

  private Address caddress;

  public String getName() {

    return this.name;
  }

  /**
   * @param name new value of {@link #getname}.
   */
  public void setName(String name) {

    this.name = name;
  }

  /**
   * @return cid
   */
  public int getCid() {

    return this.cid;
  }

  public void setCid(int cid) {

    this.cid = cid;
  }

  /**
   * @return contact
   */
  public long getContact() {

    return this.contact;
  }

  public void setContact(long contact) {

    this.contact = contact;
  }

  public Address getCustomerAddress() {

    return this.caddress;
  }

  public void setCustomerAddress(Address customerAddress) {

    this.caddress = this.caddress;
  }

  void displayInfo() {

    System.out.println("Customer Id=" + this.cid + " Coustomer name" + this.name + " Customer contact" + this.contact
        + " Customer Address(" + getCustomerAddress().getCity() + "," + getCustomerAddress().getCountry() + ","
        + getCustomerAddress().getState() + "'" + getCustomerAddress().getStreet());
    System.out.println("Customer Address(" + getCustomerAddress().getStreet() + "," + getCustomerAddress().getCity()
        + "," + getCustomerAddress().getState() + "," + getCustomerAddress().getCountry());
  }
}
