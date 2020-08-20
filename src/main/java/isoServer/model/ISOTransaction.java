package isoServer.model;

import javax.persistence.*;

@Entity
@Table(name = "transaction")
public class ISOTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "acc_name")
    private String accName;

    @Column(name = "acc_amt")
    private String accAmt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String name) {
        this.accName = name;
    }

    public String getAccAmt() {
        return accAmt;
    }

    public void setAccAmt(String amt) {
        this.accAmt = amt;
    }

}
//    create table transaction(
//            id INT NOT NULL AUTO_INCREMENT,
//            accName VARCHAR(100) NOT NULL,
//             accAmt VARCHAR(40) NOT NULL,
//
//     PRIMARY KEY (id )
//);