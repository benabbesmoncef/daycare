package com.model;

// Generated 20 juil. 2018 16:15:31 by Hibernate Tools 3.4.0.CR1

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Cmd generated by hbm2java
 */
@Entity
@Table(name = "CMD")
@SequenceGenerator(name = "seq_cmd", sequenceName = "seq_cmd",allocationSize=1,initialValue = 1)
public class Cmd implements java.io.Serializable {

	private int idCmdCmd;
	private Date datCreCmd;
	private Date dateModifCmd;
	private Date dateValidCmd;
	private Date dateAnnulCmd;
	private int prixTotalCmd;
	private List<DetailCmd> detailCmds = new ArrayList<DetailCmd>(0);
	
	public Cmd() {
	}

	public Cmd(int idCmdCmd) {
		this.idCmdCmd = idCmdCmd;
	}

	public Cmd(int idCmdCmd, Date datCreCmd, Date dateModifCmd,
			Date dateValidCmd, Date dateAnnulCmd, int prixTotalCmd,
			List<DetailCmd> detailCmds) {
		this.idCmdCmd = idCmdCmd;
		this.datCreCmd = datCreCmd;
		this.dateModifCmd = dateModifCmd;
		this.dateValidCmd = dateValidCmd;
		this.dateAnnulCmd = dateAnnulCmd;
		this.prixTotalCmd = prixTotalCmd;
		this.detailCmds = detailCmds;
	}

	@Id
	@Column(name = "ID_CMD_CMD", unique = true, nullable = false, precision = 22, scale = 0)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cmd")
	public int getIdCmdCmd() {
		return this.idCmdCmd;
	}

	public void setIdCmdCmd(int idCmdCmd) {
		this.idCmdCmd = idCmdCmd;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DAT_CRE_CMD", length = 7)
	public Date getDatCreCmd() {
		return this.datCreCmd;
	}

	public void setDatCreCmd(Date datCreCmd) {
		this.datCreCmd = datCreCmd;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_MODIF_CMD", length = 7)
	public Date getDateModifCmd() {
		return this.dateModifCmd;
	}

	public void setDateModifCmd(Date dateModifCmd) {
		this.dateModifCmd = dateModifCmd;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_VALID_CMD", length = 7)
	public Date getDateValidCmd() {
		return this.dateValidCmd;
	}

	public void setDateValidCmd(Date dateValidCmd) {
		this.dateValidCmd = dateValidCmd;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_ANNUL_CMD", length = 7)
	public Date getDateAnnulCmd() {
		return this.dateAnnulCmd;
	}

	public void setDateAnnulCmd(Date dateAnnulCmd) {
		this.dateAnnulCmd = dateAnnulCmd;
	}

	@Column(name = "PRIX_TOTAL_CMD", precision = 22, scale = 0)
	public int getPrixTotalCmd() {
		return this.prixTotalCmd;
	}

	public void setPrixTotalCmd(int prixTotalCmd) {
		this.prixTotalCmd = prixTotalCmd;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cmd", cascade=CascadeType.ALL)
	public List<DetailCmd> getDetailCmds() {
		return this.detailCmds;
	}

	public void setDetailCmds(List<DetailCmd> detailCmds) {
		this.detailCmds = detailCmds;
	}

}
