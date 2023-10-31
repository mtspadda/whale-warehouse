package model;

import jakarta.persistence.*;

public class Branch {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "branch_name", length = 10, nullable = false)
    private String branchName;

    @Column(name = "branch_email", length = 50, nullable = false)
    private String branchEmail;

    @Column(name = "branc_cod", nullable = false)
    private Long branchCode;

    @OneToOne(cascade = CascadeType.ALL)
    private Employee employee;



    public Branch(Integer id, String brandName) {
        this.id = id;
        this.branchName = brandName;
    }
}
