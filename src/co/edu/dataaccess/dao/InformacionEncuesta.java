package co.edu.dataaccess.dao;

import java.io.Serializable;
import java.sql.Date;
import java.util.Map;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class InformacionEncuesta implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long idInformacionEncuesta;
	@NotNull(message = "Id Egresado obligatorio")
	private Long idEgresado;
	@NotNull(message = "Fecha Ultima Encuesta obligatorio")
	private Date fechaUltimaEncuesta;
	@NotNull(message = "Fecha Nacimiento obligatorio")
	private Date fechaNacimiento;
	@Size(max = 45, message = "PaisNacimiento menor de 45 caracteres")
	private String paisNacimiento;
	@Size(max = 45, message = "EstadoCivil menor de 45 caracteres")
	private String estadoCivil;
	@Size(max = 45, message = "NumeroHijos menor de 45 caracteres")
	private String numeroHijos;
	@Size(max = 45, message = "TipoVivienda menor de 45 caracteres")
	private String tipoVivienda;
	@Size(max = 45, message = "NivelEduPadre menor de 45 caracteres")
	private String nivelEduPadre;
	@Size(max = 45, message = "OcupacionPadre menor de 45 caracteres")
	private String ocupacionPadre;
	@Size(max = 45, message = "Raza menor de 45 caracteres")
	private String raza;
	@Size(max = 45, message = "NivelEduMadre menor de 45 caracteres")
	private String nivelEduMadre;
	@Size(max = 45, message = "OcupacionMadre menor de 45 caracteres")
	private String ocupacionMadre;
	@Size(max = 2, message = "LimitacionPermanente menor de 2 caracteres")
	private String limitacionPermanente;
	@Size(max = 500, message = "LimitacionAfecta menor de 500 caracteres")
	private String limitacionAfecta;
	@Size(max = 80, message = "LimitacionMasAfecta menor de 80 caracteres")
	private String limitacionMasAfecta;
	@Size(max = 45, message = "TiempoAntesDeUniversidad menor de 45 caracteres")
	private String tiempoAntesDeUniversidad;
	@Size(max = 100, message = "FactorCarrera menor de 100 caracteres")
	private String factorCarrera;
	@Size(max = 45, message = "RecursosCarrera menor de 45 caracteres")
	private String recursosCarrera;
	@Size(max = 45, message = "EntidadCredito menor de 45 caracteres")
	private String entidadCredito;
	@Size(max = 2, message = "BachilleratoBilingue menor de 2 caracteres")
	private String bachilleratoBilingue;
	@Size(max = 2, message = "UnijacAyudoIdioma menor de 2 caracteres")
	private String unijacAyudoIdioma;
	@Size(max = 45, message = "IdiomaExtranjeroDomina menor de 45 caracteres")
	private String idiomaExtranjeroDomina;
	@Size(max = 45, message = "HablaIdioma menor de 45 caracteres")
	private String hablaIdioma;
	@Size(max = 45, message = "EscuchaIdioma menor de 45 caracteres")
	private String escuchaIdioma;
	@Size(max = 45, message = "LecturaIdioma menor de 45 caracteres")
	private String lecturaIdioma;
	@Size(max = 45, message = "EscrituraIdioma menor de 45 caracteres")
	private String escrituraIdioma;
	@Size(max = 45, message = "CompetenciaEscritura menor de 45 caracteres")
	private String competenciaEscritura;
	@Size(max = 45, message = "CompetenciaOral menor de 45 caracteres")
	private String competenciaOral;
	@Size(max = 45, message = "CompetenciaPersuacion menor de 45 caracteres")
	private String competenciaPersuacion;
	@Size(max = 45, message = "CompetenciaNoVerbal menor de 45 caracteres")
	private String competenciaNoVerbal;
	@Size(max = 45, message = "CompetenciaMulticultural menor de 45 caracteres")
	private String competenciaMulticultural;
	@Size(max = 45, message = "CompetenciaHerramientasBasicas menor de 45 caracteres")
	private String competenciaHerramientasBasicas;
	@Size(max = 45, message = "CompetenciaAutoAprendizaje menor de 45 caracteres")
	private String competenciaAutoAprendizaje;
	@Size(max = 45, message = "CompetenciaInnovacion menor de 45 caracteres")
	private String competenciaInnovacion;
	@Size(max = 45, message = "CompetenciaInformacion menor de 45 caracteres")
	private String competenciaInformacion;
	@Size(max = 45, message = "CompetenciaTecnologia menor de 45 caracteres")
	private String competenciaTecnologia;
	@Size(max = 45, message = "CompetenciaSoluciones menor de 45 caracteres")
	private String competenciaSoluciones;
	@Size(max = 45, message = "CompetenciaProblemas menor de 45 caracteres")
	private String competenciaProblemas;
	@Size(max = 45, message = "CompetenciaAnalisis menor de 45 caracteres")
	private String competenciaAnalisis;
	@Size(max = 45, message = "CompetenciaRealidad menor de 45 caracteres")
	private String competenciaRealidad;
	@Size(max = 45, message = "CompetenciaCultura menor de 45 caracteres")
	private String competenciaCultura;
	@Size(max = 45, message = "CompetenciaResponsabilidad menor de 45 caracteres")
	private String competenciaResponsabilidad;
	@Size(max = 45, message = "CompetenciaPlanificar menor de 45 caracteres")
	private String competenciaPlanificar;
	@Size(max = 45, message = "CompetenciaHerramientasEsp menor de 45 caracteres")
	private String competenciaHerramientasEsp;
	@Size(max = 45, message = "CompetenciaProyectos menor de 45 caracteres")
	private String competenciaProyectos;
	@Size(max = 45, message = "CompetenciaTrabEquipo menor de 45 caracteres")
	private String competenciaTrabEquipo;
	@Size(max = 45, message = "CompetenciaTrabIndependiente menor de 45 caracteres")
	private String competenciaTrabIndependiente;
	@Size(max = 45, message = "CompetenciaEtica menor de 45 caracteres")
	private String competenciaEtica;
	@Size(max = 45, message = "CompetenciaCambios menor de 45 caracteres")
	private String competenciaCambios;
	@Size(max = 45, message = "CompetenciaPresion menor de 45 caracteres")
	private String competenciaPresion;
	@Size(max = 200, message = "CompetenciaDebilUniajc menor de 200 caracteres")
	private String competenciaDebilUniajc;
	@Size(max = 200, message = "CompetenciaFuerteUniacj menor de 200 caracteres")
	private String competenciaFuerteUniacj;
	@Size(max = 200, message = "CompetenciaMenosUtil menor de 200 caracteres")
	private String competenciaMenosUtil;
	@Size(max = 200, message = "CompetenciaMasUtil menor de 200 caracteres")
	private String competenciaMasUtil;
	@Size(max = 45, message = "LargoPlazo menor de 45 caracteres")
	private String largoPlazo;
	@Size(max = 45, message = "Actividad menor de 45 caracteres")
	private String actividad;
	@Size(max = 45, message = "VinculacionLaboral menor de 45 caracteres")
	private String vinculacionLaboral;
	@Size(max = 45, message = "PrimerTrabajo menor de 45 caracteres")
	private String primerTrabajo;
	@Size(max = 45, message = "CoberturaEmpresa menor de 45 caracteres")
	private String coberturaEmpresa;
	@Size(max = 45, message = "InteresEmprender menor de 45 caracteres")
	private String interesEmprender;
	@Size(max = 200, message = "DificultadEmprender menor de 200 caracteres")
	private String dificultadEmprender;
	@Size(max = 45, message = "RelacionCarreraTrabajo menor de 45 caracteres")
	private String relacionCarreraTrabajo;
	@Size(max = 45, message = "ActEconomicaEmpresa menor de 45 caracteres")
	private String actEconomicaEmpresa;
	@Size(max = 45, message = "SituacionExpectativas menor de 45 caracteres")
	private String situacionExpectativas;
	@Size(max = 45, message = "UtilidadCarreraTrabajo menor de 45 caracteres")
	private String utilidadCarreraTrabajo;
	@Size(max = 45, message = "UtilidadCarreraVida menor de 45 caracteres")
	private String utilidadCarreraVida;
	@Size(max = 45, message = "NombreEmpresa menor de 45 caracteres")
	private String nombreEmpresa;
	@Size(max = 45, message = "CargoEmpresa menor de 45 caracteres")
	private String cargoEmpresa;
	@Size(max = 2, message = "TrabajoContribuyeDesarrollo menor de 2 caracteres")
	private String trabajoContribuyeDesarrollo;
	@Size(max = 2, message = "CarreraProductividadTrabajo menor de 2 caracteres")
	private String carreraProductividadTrabajo;
	@Size(max = 45, message = "SatisfaccionTrabajo menor de 45 caracteres")
	private String satisfaccionTrabajo;
	@Size(max = 45, message = "CaracterizacionDesempleado menor de 45 caracteres")
	private String caracterizacionDesempleado;
	@Size(max = 45, message = "MesesBuscandoTrabajo menor de 45 caracteres")
	private String mesesBuscandoTrabajo;
	@Size(max = 45, message = "SentidoPertenencia menor de 45 caracteres")
	private String sentidoPertenencia;
	@Size(max = 45, message = "PosibilidadesLaborales menor de 45 caracteres")
	private String posibilidadesLaborales;
	@Size(max = 2, message = "MismaCarrera menor de 2 caracteres")
	private String mismaCarrera;
	@Size(max = 100, message = "RazonMismaCarrera menor de 100 caracteres")
	private String razonMismaCarrera;
	@Size(max = 100, message = "RazonNoMismaCarrera menor de 100 caracteres")
	private String razonNoMismaCarrera;
	@Size(max = 45, message = "OtrosEstudios menor de 45 caracteres")
	private String otrosEstudios;
	@Size(max = 2, message = "RecomiendaPrograma menor de 2 caracteres")
	private String recomiendaPrograma;
	@Size(max = 45, message = "PersDocenteRelaciones menor de 45 caracteres")
	private String persDocenteRelaciones;
	@Size(max = 45, message = "PersDocenteFormacionExp menor de 45 caracteres")
	private String persDocenteFormacionExp;
	@Size(max = 45, message = "PersDocenteFundTeorica menor de 45 caracteres")
	private String persDocenteFundTeorica;
	@Size(max = 45, message = "PersDocenteDispTiempo menor de 45 caracteres")
	private String persDocenteDispTiempo;
	@Size(max = 45, message = "PersDocenteFacilidadEnsenar menor de 45 caracteres")
	private String persDocenteFacilidadEnsenar;
	@Size(max = 45, message = "PersDocenteTrabajoCampo menor de 45 caracteres")
	private String persDocenteTrabajoCampo;
	@Size(max = 45, message = "PersDocenteComunicacionEst menor de 45 caracteres")
	private String persDocenteComunicacionEst;
	@Size(max = 45, message = "PersDocenteExigenciaAcade menor de 45 caracteres")
	private String persDocenteExigenciaAcade;
	@Size(max = 45, message = "ApoyoEstIntercambios menor de 45 caracteres")
	private String apoyoEstIntercambios;
	@Size(max = 45, message = "ApoyoEstPracticasEmpr menor de 45 caracteres")
	private String apoyoEstPracticasEmpr;
	@Size(max = 45, message = "ApoyoEstOportunidadesEmpleo menor de 45 caracteres")
	private String apoyoEstOportunidadesEmpleo;
	@Size(max = 45, message = "ApoyoEstDesarrolloInvestigacion menor de 45 caracteres")
	private String apoyoEstDesarrolloInvestigacion;
	@Size(max = 45, message = "ApoyoEstEventosActualizacion menor de 45 caracteres")
	private String apoyoEstEventosActualizacion;
	@Size(max = 45, message = "ApoyoEstAsistenciaMedica menor de 45 caracteres")
	private String apoyoEstAsistenciaMedica;
	@Size(max = 45, message = "ApoyoEstActividadesLudicas menor de 45 caracteres")
	private String apoyoEstActividadesLudicas;
	@Size(max = 45, message = "GestionAdminTramites menor de 45 caracteres")
	private String gestionAdminTramites;
	@Size(max = 45, message = "GestionAdminAtencion menor de 45 caracteres")
	private String gestionAdminAtencion;
	@Size(max = 45, message = "RecFisicosSalones menor de 45 caracteres")
	private String recFisicosSalones;
	@Size(max = 45, message = "RecFisicosLaboratorios menor de 45 caracteres")
	private String recFisicosLaboratorios;
	@Size(max = 45, message = "RecFisicosEspacios menor de 45 caracteres")
	private String recFisicosEspacios;
	@Size(max = 45, message = "RecFisicosAudiovisuales menor de 45 caracteres")
	private String recFisicosAudiovisuales;
	@Size(max = 45, message = "RecFisicosSalasSistemas menor de 45 caracteres")
	private String recFisicosSalasSistemas;
	@Size(max = 45, message = "RecFisicosDeportes menor de 45 caracteres")
	private String recFisicosDeportes;
	@Size(max = 45, message = "RecFisicosCulturales menor de 45 caracteres")
	private String recFisicosCulturales;
	@Size(max = 45, message = "RecFisicosBiblioteca menor de 45 caracteres")
	private String recFisicosBiblioteca;
	@Size(max = 45, message = "RecFisicosMediosComunicacion menor de 45 caracteres")
	private String recFisicosMediosComunicacion;
	@Size(max = 2, message = "ProyectoProductoDivulgar menor de 2 caracteres")
	private String proyectoProductoDivulgar;
	@Size(max = 2, message = "EstudiosPostGradoOtraUniversidad menor de 2 caracteres")
	private String estudiosPostGradoOtraUniversidad;
	@Size(max = 2, message = "ReconocimientoLaboral menor de 2 caracteres")
	private String reconocimientoLaboral;
	@Size(max = 2, message = "GrupoInvestigacion menor de 2 caracteres")
	private String grupoInvestigacion;
	@Size(max = 4000, message = "ObservacionesProgramaEgresados menor de 4000 caracteres")
	private String observacionesProgramaEgresados;
	@Size(max = 2, message = "CompartirEstudiantesUniajc menor de 2 caracteres")
	private String compartirEstudiantesUniajc;
	@Size(max = 4000, message = "SugerenciasProgramaAcademico menor de 4000 caracteres")
	private String sugerenciasProgramaAcademico;

	public InformacionEncuesta() {
		super();
		this.idEgresado = 0L;
		this.fechaUltimaEncuesta = new Date(System.currentTimeMillis());
		this.fechaNacimiento = new Date(System.currentTimeMillis());
	}

	public InformacionEncuesta(Map<String, String> entity) {
		this.idEgresado = 0L;
		this.fechaUltimaEncuesta = new Date(System.currentTimeMillis());
		this.fechaNacimiento = new Date(System.currentTimeMillis());
		setPaisNacimiento(entity.get("paisNacimiento"));
		setEstadoCivil(entity.get("estadoCivil"));
		setNumeroHijos(entity.get("numeroHijos"));
		setTipoVivienda(entity.get("tipoVivienda"));
		setNivelEduPadre(entity.get("nivelEduPadre"));
		setOcupacionPadre(entity.get("ocupacionPadre"));
		setRaza(entity.get("raza"));
		setNivelEduMadre(entity.get("nivelEduMadre"));
		setOcupacionMadre(entity.get("ocupacionMadre"));
		setLimitacionPermanente(entity.get("limitacionPermanente"));
		setLimitacionAfecta(entity.get("limitacionAfecta"));
		setLimitacionMasAfecta(entity.get("limitacionMasAfecta"));
		setTiempoAntesDeUniversidad(entity.get("tiempoAntesDeUniversidad"));
		setFactorCarrera(entity.get("factorCarrera"));
		setRecursosCarrera(entity.get("recursosCarrera"));
		setEntidadCredito(entity.get("entidadCredito"));
		setBachilleratoBilingue(entity.get("bachilleratoBilingue"));
		setUnijacAyudoIdioma(entity.get("unijacAyudoIdioma"));
		setIdiomaExtranjeroDomina(entity.get("idiomaExtranjeroDomina"));
		setHablaIdioma(entity.get("hablaIdioma"));
		setEscuchaIdioma(entity.get("escuchaIdioma"));
		setLecturaIdioma(entity.get("lecturaIdioma"));
		setEscrituraIdioma(entity.get("escrituraIdioma"));
		setCompetenciaEscritura(entity.get("competenciaEscritura"));
		setCompetenciaOral(entity.get("competenciaOral"));
		setCompetenciaPersuacion(entity.get("competenciaPersuacion"));
		setCompetenciaNoVerbal(entity.get("competenciaNoVerbal"));
		setCompetenciaMulticultural(entity.get("competenciaMulticultural"));
		setCompetenciaHerramientasBasicas(entity.get("competenciaHerramientasBasicas"));
		setCompetenciaAutoAprendizaje(entity.get("competenciaAutoAprendizaje"));
		setCompetenciaInnovacion(entity.get("competenciaInnovacion"));
		setCompetenciaInformacion(entity.get("competenciaInformacion"));
		setCompetenciaTecnologia(entity.get("competenciaTecnologia"));
		setCompetenciaSoluciones(entity.get("competenciaSoluciones"));
		setCompetenciaProblemas(entity.get("competenciaProblemas"));
		setCompetenciaAnalisis(entity.get("competenciaAnalisis"));
		setCompetenciaRealidad(entity.get("competenciaRealidad"));
		setCompetenciaCultura(entity.get("competenciaCultura"));
		setCompetenciaResponsabilidad(entity.get("competenciaResponsabilidad"));
		setCompetenciaPlanificar(entity.get("competenciaPlanificar"));
		setCompetenciaHerramientasEsp(entity.get("competenciaHerramientasEsp"));
		setCompetenciaProyectos(entity.get("competenciaProyectos"));
		setCompetenciaTrabEquipo(entity.get("competenciaTrabEquipo"));
		setCompetenciaTrabIndependiente(entity.get("competenciaTrabIndependiente"));
		setCompetenciaEtica(entity.get("competenciaEtica"));
		setCompetenciaCambios(entity.get("competenciaCambios"));
		setCompetenciaPresion(entity.get("competenciaPresion"));
		setCompetenciaDebilUniajc(entity.get("competenciaDebilUniajc"));
		setCompetenciaFuerteUniacj(entity.get("competenciaFuerteUniacj"));
		setCompetenciaMenosUtil(entity.get("competenciaMenosUtil"));
		setCompetenciaMasUtil(entity.get("competenciaMasUtil"));
		setLargoPlazo(entity.get("largoPlazo"));
		setActividad(entity.get("actividad"));
		setVinculacionLaboral(entity.get("vinculacionLaboral"));
		setPrimerTrabajo(entity.get("primerTrabajo"));
		setCoberturaEmpresa(entity.get("coberturaEmpresa"));
		setInteresEmprender(entity.get("interesEmprender"));
		setDificultadEmprender(entity.get("dificultadEmprender"));
		setRelacionCarreraTrabajo(entity.get("relacionCarreraTrabajo"));
		setActEconomicaEmpresa(entity.get("actEconomicaEmpresa"));
		setSituacionExpectativas(entity.get("situacionExpectativas"));
		setUtilidadCarreraTrabajo(entity.get("utilidadCarreraTrabajo"));
		setUtilidadCarreraVida(entity.get("utilidadCarreraVida"));
		setNombreEmpresa(entity.get("nombreEmpresa"));
		setCargoEmpresa(entity.get("cargoEmpresa"));
		setTrabajoContribuyeDesarrollo(entity.get("trabajoContribuyeDesarrollo"));
		setCarreraProductividadTrabajo(entity.get("carreraProductividadTrabajo"));
		setSatisfaccionTrabajo(entity.get("satisfaccionTrabajo"));
		setCaracterizacionDesempleado(entity.get("caracterizacionDesempleado"));
		setMesesBuscandoTrabajo(entity.get("mesesBuscandoTrabajo"));
		setSentidoPertenencia(entity.get("sentidoPertenencia"));
		setPosibilidadesLaborales(entity.get("posibilidadesLaborales"));
		setMismaCarrera(entity.get("mismaCarrera"));
		setRazonMismaCarrera(entity.get("razonMismaCarrera"));
		setRazonNoMismaCarrera(entity.get("razonNoMismaCarrera"));
		setOtrosEstudios(entity.get("otrosEstudios"));
		setRecomiendaPrograma(entity.get("recomiendaPrograma"));
		setPersDocenteRelaciones(entity.get("persDocenteRelaciones"));
		setPersDocenteFormacionExp(entity.get("persDocenteFormacionExp"));
		setPersDocenteFundTeorica(entity.get("persDocenteFundTeorica"));
		setPersDocenteDispTiempo(entity.get("persDocenteDispTiempo"));
		setPersDocenteFacilidadEnsenar(entity.get("persDocenteFacilidadEnsenar"));
		setPersDocenteTrabajoCampo(entity.get("persDocenteTrabajoCampo"));
		setPersDocenteComunicacionEst(entity.get("persDocenteComunicacionEst"));
		setPersDocenteExigenciaAcade(entity.get("persDocenteExigenciaAcade"));
		setApoyoEstIntercambios(entity.get("apoyoEstIntercambios"));
		setApoyoEstPracticasEmpr(entity.get("apoyoEstPracticasEmpr"));
		setApoyoEstOportunidadesEmpleo(entity.get("apoyoEstOportunidadesEmpleo"));
		setApoyoEstDesarrolloInvestigacion(entity.get("apoyoEstDesarrolloInvestigacion"));
		setApoyoEstEventosActualizacion(entity.get("apoyoEstEventosActualizacion"));
		setApoyoEstAsistenciaMedica(entity.get("apoyoEstAsistenciaMedica"));
		setApoyoEstActividadesLudicas(entity.get("apoyoEstActividadesLudicas"));
		setGestionAdminTramites(entity.get("gestionAdminTramites"));
		setGestionAdminAtencion(entity.get("gestionAdminAtencion"));
		setRecFisicosSalones(entity.get("recFisicosSalones"));
		setRecFisicosLaboratorios(entity.get("recFisicosLaboratorios"));
		setRecFisicosEspacios(entity.get("recFisicosEspacios"));
		setRecFisicosAudiovisuales(entity.get("recFisicosAudiovisuales"));
		setRecFisicosSalasSistemas(entity.get("recFisicosSalasSistemas"));
		setRecFisicosDeportes(entity.get("recFisicosDeportes"));
		setRecFisicosCulturales(entity.get("recFisicosCulturales"));
		setRecFisicosBiblioteca(entity.get("recFisicosBiblioteca"));
		setRecFisicosMediosComunicacion(entity.get("recFisicosMediosComunicacion"));
		setProyectoProductoDivulgar(entity.get("proyectoProductoDivulgar"));
		setEstudiosPostGradoOtraUniversidad(entity.get("estudiosPostGradoOtraUniversidad"));
		setReconocimientoLaboral(entity.get("reconocimientoLaboral"));
		setGrupoInvestigacion(entity.get("grupoInvestigacion"));
		setObservacionesProgramaEgresados(entity.get("observacionesProgramaEgresados"));
		setCompartirEstudiantesUniajc(entity.get("compartirEstudiantesUniajc"));
		setSugerenciasProgramaAcademico(entity.get("sugerenciasProgramaAcademico"));
	}

	public Long getIdInformacionEncuesta() {
		return idInformacionEncuesta;
	}

	public void setIdInformacionEncuesta(Long idInformacionEncuesta) {
		this.idInformacionEncuesta = idInformacionEncuesta;
	}

	public Long getIdEgresado() {
		return idEgresado;
	}

	public void setIdEgresado(Long idEgresado) {
		this.idEgresado = idEgresado;
	}

	public Date getFechaUltimaEncuesta() {
		return fechaUltimaEncuesta;
	}

	public void setFechaUltimaEncuesta(Date fechaUltimaEncuesta) {
		this.fechaUltimaEncuesta = fechaUltimaEncuesta;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getPaisNacimiento() {
		return paisNacimiento;
	}

	public void setPaisNacimiento(String paisNacimiento) {
		this.paisNacimiento = paisNacimiento;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getNumeroHijos() {
		return numeroHijos;
	}

	public void setNumeroHijos(String numeroHijos) {
		this.numeroHijos = numeroHijos;
	}

	public String getTipoVivienda() {
		return tipoVivienda;
	}

	public void setTipoVivienda(String tipoVivienda) {
		this.tipoVivienda = tipoVivienda;
	}

	public String getNivelEduPadre() {
		return nivelEduPadre;
	}

	public void setNivelEduPadre(String nivelEduPadre) {
		this.nivelEduPadre = nivelEduPadre;
	}

	public String getOcupacionPadre() {
		return ocupacionPadre;
	}

	public void setOcupacionPadre(String ocupacionPadre) {
		this.ocupacionPadre = ocupacionPadre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getNivelEduMadre() {
		return nivelEduMadre;
	}

	public void setNivelEduMadre(String nivelEduMadre) {
		this.nivelEduMadre = nivelEduMadre;
	}

	public String getOcupacionMadre() {
		return ocupacionMadre;
	}

	public void setOcupacionMadre(String ocupacionMadre) {
		this.ocupacionMadre = ocupacionMadre;
	}

	public String getLimitacionPermanente() {
		return limitacionPermanente;
	}

	public void setLimitacionPermanente(String limitacionPermanente) {
		this.limitacionPermanente = limitacionPermanente;
	}

	public String getLimitacionAfecta() {
		return limitacionAfecta;
	}

	public void setLimitacionAfecta(String limitacionAfecta) {
		this.limitacionAfecta = limitacionAfecta;
	}

	public String getLimitacionMasAfecta() {
		return limitacionMasAfecta;
	}

	public void setLimitacionMasAfecta(String limitacionMasAfecta) {
		this.limitacionMasAfecta = limitacionMasAfecta;
	}

	public String getTiempoAntesDeUniversidad() {
		return tiempoAntesDeUniversidad;
	}

	public void setTiempoAntesDeUniversidad(String tiempoAntesDeUniversidad) {
		this.tiempoAntesDeUniversidad = tiempoAntesDeUniversidad;
	}

	public String getFactorCarrera() {
		return factorCarrera;
	}

	public void setFactorCarrera(String factorCarrera) {
		this.factorCarrera = factorCarrera;
	}

	public String getRecursosCarrera() {
		return recursosCarrera;
	}

	public void setRecursosCarrera(String recursosCarrera) {
		this.recursosCarrera = recursosCarrera;
	}

	public String getEntidadCredito() {
		return entidadCredito;
	}

	public void setEntidadCredito(String entidadCredito) {
		this.entidadCredito = entidadCredito;
	}

	public String getBachilleratoBilingue() {
		return bachilleratoBilingue;
	}

	public void setBachilleratoBilingue(String bachilleratoBilingue) {
		this.bachilleratoBilingue = bachilleratoBilingue;
	}

	public String getUnijacAyudoIdioma() {
		return unijacAyudoIdioma;
	}

	public void setUnijacAyudoIdioma(String unijacAyudoIdioma) {
		this.unijacAyudoIdioma = unijacAyudoIdioma;
	}

	public String getIdiomaExtranjeroDomina() {
		return idiomaExtranjeroDomina;
	}

	public void setIdiomaExtranjeroDomina(String idiomaExtranjeroDomina) {
		this.idiomaExtranjeroDomina = idiomaExtranjeroDomina;
	}

	public String getHablaIdioma() {
		return hablaIdioma;
	}

	public void setHablaIdioma(String hablaIdioma) {
		this.hablaIdioma = hablaIdioma;
	}

	public String getEscuchaIdioma() {
		return escuchaIdioma;
	}

	public void setEscuchaIdioma(String escuchaIdioma) {
		this.escuchaIdioma = escuchaIdioma;
	}

	public String getLecturaIdioma() {
		return lecturaIdioma;
	}

	public void setLecturaIdioma(String lecturaIdioma) {
		this.lecturaIdioma = lecturaIdioma;
	}

	public String getEscrituraIdioma() {
		return escrituraIdioma;
	}

	public void setEscrituraIdioma(String escrituraIdioma) {
		this.escrituraIdioma = escrituraIdioma;
	}

	public String getCompetenciaEscritura() {
		return competenciaEscritura;
	}

	public void setCompetenciaEscritura(String competenciaEscritura) {
		this.competenciaEscritura = competenciaEscritura;
	}

	public String getCompetenciaOral() {
		return competenciaOral;
	}

	public void setCompetenciaOral(String competenciaOral) {
		this.competenciaOral = competenciaOral;
	}

	public String getCompetenciaPersuacion() {
		return competenciaPersuacion;
	}

	public void setCompetenciaPersuacion(String competenciaPersuacion) {
		this.competenciaPersuacion = competenciaPersuacion;
	}

	public String getCompetenciaNoVerbal() {
		return competenciaNoVerbal;
	}

	public void setCompetenciaNoVerbal(String competenciaNoVerbal) {
		this.competenciaNoVerbal = competenciaNoVerbal;
	}

	public String getCompetenciaMulticultural() {
		return competenciaMulticultural;
	}

	public void setCompetenciaMulticultural(String competenciaMulticultural) {
		this.competenciaMulticultural = competenciaMulticultural;
	}

	public String getCompetenciaHerramientasBasicas() {
		return competenciaHerramientasBasicas;
	}

	public void setCompetenciaHerramientasBasicas(String competenciaHerramientasBasicas) {
		this.competenciaHerramientasBasicas = competenciaHerramientasBasicas;
	}

	public String getCompetenciaAutoAprendizaje() {
		return competenciaAutoAprendizaje;
	}

	public void setCompetenciaAutoAprendizaje(String competenciaAutoAprendizaje) {
		this.competenciaAutoAprendizaje = competenciaAutoAprendizaje;
	}

	public String getCompetenciaInnovacion() {
		return competenciaInnovacion;
	}

	public void setCompetenciaInnovacion(String competenciaInnovacion) {
		this.competenciaInnovacion = competenciaInnovacion;
	}

	public String getCompetenciaInformacion() {
		return competenciaInformacion;
	}

	public void setCompetenciaInformacion(String competenciaInformacion) {
		this.competenciaInformacion = competenciaInformacion;
	}

	public String getCompetenciaTecnologia() {
		return competenciaTecnologia;
	}

	public void setCompetenciaTecnologia(String competenciaTecnologia) {
		this.competenciaTecnologia = competenciaTecnologia;
	}

	public String getCompetenciaSoluciones() {
		return competenciaSoluciones;
	}

	public void setCompetenciaSoluciones(String competenciaSoluciones) {
		this.competenciaSoluciones = competenciaSoluciones;
	}

	public String getCompetenciaProblemas() {
		return competenciaProblemas;
	}

	public void setCompetenciaProblemas(String competenciaProblemas) {
		this.competenciaProblemas = competenciaProblemas;
	}

	public String getCompetenciaAnalisis() {
		return competenciaAnalisis;
	}

	public void setCompetenciaAnalisis(String competenciaAnalisis) {
		this.competenciaAnalisis = competenciaAnalisis;
	}

	public String getCompetenciaRealidad() {
		return competenciaRealidad;
	}

	public void setCompetenciaRealidad(String competenciaRealidad) {
		this.competenciaRealidad = competenciaRealidad;
	}

	public String getCompetenciaCultura() {
		return competenciaCultura;
	}

	public void setCompetenciaCultura(String competenciaCultura) {
		this.competenciaCultura = competenciaCultura;
	}

	public String getCompetenciaResponsabilidad() {
		return competenciaResponsabilidad;
	}

	public void setCompetenciaResponsabilidad(String competenciaResponsabilidad) {
		this.competenciaResponsabilidad = competenciaResponsabilidad;
	}

	public String getCompetenciaPlanificar() {
		return competenciaPlanificar;
	}

	public void setCompetenciaPlanificar(String competenciaPlanificar) {
		this.competenciaPlanificar = competenciaPlanificar;
	}

	public String getCompetenciaHerramientasEsp() {
		return competenciaHerramientasEsp;
	}

	public void setCompetenciaHerramientasEsp(String competenciaHerramientasEsp) {
		this.competenciaHerramientasEsp = competenciaHerramientasEsp;
	}

	public String getCompetenciaProyectos() {
		return competenciaProyectos;
	}

	public void setCompetenciaProyectos(String competenciaProyectos) {
		this.competenciaProyectos = competenciaProyectos;
	}

	public String getCompetenciaTrabEquipo() {
		return competenciaTrabEquipo;
	}

	public void setCompetenciaTrabEquipo(String competenciaTrabEquipo) {
		this.competenciaTrabEquipo = competenciaTrabEquipo;
	}

	public String getCompetenciaTrabIndependiente() {
		return competenciaTrabIndependiente;
	}

	public void setCompetenciaTrabIndependiente(String competenciaTrabIndependiente) {
		this.competenciaTrabIndependiente = competenciaTrabIndependiente;
	}

	public String getCompetenciaEtica() {
		return competenciaEtica;
	}

	public void setCompetenciaEtica(String competenciaEtica) {
		this.competenciaEtica = competenciaEtica;
	}

	public String getCompetenciaCambios() {
		return competenciaCambios;
	}

	public void setCompetenciaCambios(String competenciaCambios) {
		this.competenciaCambios = competenciaCambios;
	}

	public String getCompetenciaPresion() {
		return competenciaPresion;
	}

	public void setCompetenciaPresion(String competenciaPresion) {
		this.competenciaPresion = competenciaPresion;
	}

	public String getCompetenciaDebilUniajc() {
		return competenciaDebilUniajc;
	}

	public void setCompetenciaDebilUniajc(String competenciaDebilUniajc) {
		this.competenciaDebilUniajc = competenciaDebilUniajc;
	}

	public String getCompetenciaFuerteUniacj() {
		return competenciaFuerteUniacj;
	}

	public void setCompetenciaFuerteUniacj(String competenciaFuerteUniacj) {
		this.competenciaFuerteUniacj = competenciaFuerteUniacj;
	}

	public String getCompetenciaMenosUtil() {
		return competenciaMenosUtil;
	}

	public void setCompetenciaMenosUtil(String competenciaMenosUtil) {
		this.competenciaMenosUtil = competenciaMenosUtil;
	}

	public String getCompetenciaMasUtil() {
		return competenciaMasUtil;
	}

	public void setCompetenciaMasUtil(String competenciaMasUtil) {
		this.competenciaMasUtil = competenciaMasUtil;
	}

	public String getLargoPlazo() {
		return largoPlazo;
	}

	public void setLargoPlazo(String largoPlazo) {
		this.largoPlazo = largoPlazo;
	}

	public String getActividad() {
		return actividad;
	}

	public void setActividad(String actividad) {
		this.actividad = actividad;
	}

	public String getVinculacionLaboral() {
		return vinculacionLaboral;
	}

	public void setVinculacionLaboral(String vinculacionLaboral) {
		this.vinculacionLaboral = vinculacionLaboral;
	}

	public String getPrimerTrabajo() {
		return primerTrabajo;
	}

	public void setPrimerTrabajo(String primerTrabajo) {
		this.primerTrabajo = primerTrabajo;
	}

	public String getCoberturaEmpresa() {
		return coberturaEmpresa;
	}

	public void setCoberturaEmpresa(String coberturaEmpresa) {
		this.coberturaEmpresa = coberturaEmpresa;
	}

	public String getInteresEmprender() {
		return interesEmprender;
	}

	public void setInteresEmprender(String interesEmprender) {
		this.interesEmprender = interesEmprender;
	}

	public String getDificultadEmprender() {
		return dificultadEmprender;
	}

	public void setDificultadEmprender(String dificultadEmprender) {
		this.dificultadEmprender = dificultadEmprender;
	}

	public String getRelacionCarreraTrabajo() {
		return relacionCarreraTrabajo;
	}

	public void setRelacionCarreraTrabajo(String relacionCarreraTrabajo) {
		this.relacionCarreraTrabajo = relacionCarreraTrabajo;
	}

	public String getActEconomicaEmpresa() {
		return actEconomicaEmpresa;
	}

	public void setActEconomicaEmpresa(String actEconomicaEmpresa) {
		this.actEconomicaEmpresa = actEconomicaEmpresa;
	}

	public String getSituacionExpectativas() {
		return situacionExpectativas;
	}

	public void setSituacionExpectativas(String situacionExpectativas) {
		this.situacionExpectativas = situacionExpectativas;
	}

	public String getUtilidadCarreraTrabajo() {
		return utilidadCarreraTrabajo;
	}

	public void setUtilidadCarreraTrabajo(String utilidadCarreraTrabajo) {
		this.utilidadCarreraTrabajo = utilidadCarreraTrabajo;
	}

	public String getUtilidadCarreraVida() {
		return utilidadCarreraVida;
	}

	public void setUtilidadCarreraVida(String utilidadCarreraVida) {
		this.utilidadCarreraVida = utilidadCarreraVida;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public String getCargoEmpresa() {
		return cargoEmpresa;
	}

	public void setCargoEmpresa(String cargoEmpresa) {
		this.cargoEmpresa = cargoEmpresa;
	}

	public String getTrabajoContribuyeDesarrollo() {
		return trabajoContribuyeDesarrollo;
	}

	public void setTrabajoContribuyeDesarrollo(String trabajoContribuyeDesarrollo) {
		this.trabajoContribuyeDesarrollo = trabajoContribuyeDesarrollo;
	}

	public String getCarreraProductividadTrabajo() {
		return carreraProductividadTrabajo;
	}

	public void setCarreraProductividadTrabajo(String carreraProductividadTrabajo) {
		this.carreraProductividadTrabajo = carreraProductividadTrabajo;
	}

	public String getSatisfaccionTrabajo() {
		return satisfaccionTrabajo;
	}

	public void setSatisfaccionTrabajo(String satisfaccionTrabajo) {
		this.satisfaccionTrabajo = satisfaccionTrabajo;
	}

	public String getCaracterizacionDesempleado() {
		return caracterizacionDesempleado;
	}

	public void setCaracterizacionDesempleado(String caracterizacionDesempleado) {
		this.caracterizacionDesempleado = caracterizacionDesempleado;
	}

	public String getMesesBuscandoTrabajo() {
		return mesesBuscandoTrabajo;
	}

	public void setMesesBuscandoTrabajo(String mesesBuscandoTrabajo) {
		this.mesesBuscandoTrabajo = mesesBuscandoTrabajo;
	}

	public String getSentidoPertenencia() {
		return sentidoPertenencia;
	}

	public void setSentidoPertenencia(String sentidoPertenencia) {
		this.sentidoPertenencia = sentidoPertenencia;
	}

	public String getPosibilidadesLaborales() {
		return posibilidadesLaborales;
	}

	public void setPosibilidadesLaborales(String posibilidadesLaborales) {
		this.posibilidadesLaborales = posibilidadesLaborales;
	}

	public String getMismaCarrera() {
		return mismaCarrera;
	}

	public void setMismaCarrera(String mismaCarrera) {
		this.mismaCarrera = mismaCarrera;
	}

	public String getRazonMismaCarrera() {
		return razonMismaCarrera;
	}

	public void setRazonMismaCarrera(String razonMismaCarrera) {
		this.razonMismaCarrera = razonMismaCarrera;
	}

	public String getRazonNoMismaCarrera() {
		return razonNoMismaCarrera;
	}

	public void setRazonNoMismaCarrera(String razonNoMismaCarrera) {
		this.razonNoMismaCarrera = razonNoMismaCarrera;
	}

	public String getOtrosEstudios() {
		return otrosEstudios;
	}

	public void setOtrosEstudios(String otrosEstudios) {
		this.otrosEstudios = otrosEstudios;
	}

	public String getRecomiendaPrograma() {
		return recomiendaPrograma;
	}

	public void setRecomiendaPrograma(String recomiendaPrograma) {
		this.recomiendaPrograma = recomiendaPrograma;
	}

	public String getPersDocenteRelaciones() {
		return persDocenteRelaciones;
	}

	public void setPersDocenteRelaciones(String persDocenteRelaciones) {
		this.persDocenteRelaciones = persDocenteRelaciones;
	}

	public String getPersDocenteFormacionExp() {
		return persDocenteFormacionExp;
	}

	public void setPersDocenteFormacionExp(String persDocenteFormacionExp) {
		this.persDocenteFormacionExp = persDocenteFormacionExp;
	}

	public String getPersDocenteFundTeorica() {
		return persDocenteFundTeorica;
	}

	public void setPersDocenteFundTeorica(String persDocenteFundTeorica) {
		this.persDocenteFundTeorica = persDocenteFundTeorica;
	}

	public String getPersDocenteDispTiempo() {
		return persDocenteDispTiempo;
	}

	public void setPersDocenteDispTiempo(String persDocenteDispTiempo) {
		this.persDocenteDispTiempo = persDocenteDispTiempo;
	}

	public String getPersDocenteFacilidadEnsenar() {
		return persDocenteFacilidadEnsenar;
	}

	public void setPersDocenteFacilidadEnsenar(String persDocenteFacilidadEnsenar) {
		this.persDocenteFacilidadEnsenar = persDocenteFacilidadEnsenar;
	}

	public String getPersDocenteTrabajoCampo() {
		return persDocenteTrabajoCampo;
	}

	public void setPersDocenteTrabajoCampo(String persDocenteTrabajoCampo) {
		this.persDocenteTrabajoCampo = persDocenteTrabajoCampo;
	}

	public String getPersDocenteComunicacionEst() {
		return persDocenteComunicacionEst;
	}

	public void setPersDocenteComunicacionEst(String persDocenteComunicacionEst) {
		this.persDocenteComunicacionEst = persDocenteComunicacionEst;
	}

	public String getPersDocenteExigenciaAcade() {
		return persDocenteExigenciaAcade;
	}

	public void setPersDocenteExigenciaAcade(String persDocenteExigenciaAcade) {
		this.persDocenteExigenciaAcade = persDocenteExigenciaAcade;
	}

	public String getApoyoEstIntercambios() {
		return apoyoEstIntercambios;
	}

	public void setApoyoEstIntercambios(String apoyoEstIntercambios) {
		this.apoyoEstIntercambios = apoyoEstIntercambios;
	}

	public String getApoyoEstPracticasEmpr() {
		return apoyoEstPracticasEmpr;
	}

	public void setApoyoEstPracticasEmpr(String apoyoEstPracticasEmpr) {
		this.apoyoEstPracticasEmpr = apoyoEstPracticasEmpr;
	}

	public String getApoyoEstOportunidadesEmpleo() {
		return apoyoEstOportunidadesEmpleo;
	}

	public void setApoyoEstOportunidadesEmpleo(String apoyoEstOportunidadesEmpleo) {
		this.apoyoEstOportunidadesEmpleo = apoyoEstOportunidadesEmpleo;
	}

	public String getApoyoEstDesarrolloInvestigacion() {
		return apoyoEstDesarrolloInvestigacion;
	}

	public void setApoyoEstDesarrolloInvestigacion(String apoyoEstDesarrolloInvestigacion) {
		this.apoyoEstDesarrolloInvestigacion = apoyoEstDesarrolloInvestigacion;
	}

	public String getApoyoEstEventosActualizacion() {
		return apoyoEstEventosActualizacion;
	}

	public void setApoyoEstEventosActualizacion(String apoyoEstEventosActualizacion) {
		this.apoyoEstEventosActualizacion = apoyoEstEventosActualizacion;
	}

	public String getApoyoEstAsistenciaMedica() {
		return apoyoEstAsistenciaMedica;
	}

	public void setApoyoEstAsistenciaMedica(String apoyoEstAsistenciaMedica) {
		this.apoyoEstAsistenciaMedica = apoyoEstAsistenciaMedica;
	}

	public String getApoyoEstActividadesLudicas() {
		return apoyoEstActividadesLudicas;
	}

	public void setApoyoEstActividadesLudicas(String apoyoEstActividadesLudicas) {
		this.apoyoEstActividadesLudicas = apoyoEstActividadesLudicas;
	}

	public String getGestionAdminTramites() {
		return gestionAdminTramites;
	}

	public void setGestionAdminTramites(String gestionAdminTramites) {
		this.gestionAdminTramites = gestionAdminTramites;
	}

	public String getGestionAdminAtencion() {
		return gestionAdminAtencion;
	}

	public void setGestionAdminAtencion(String gestionAdminAtencion) {
		this.gestionAdminAtencion = gestionAdminAtencion;
	}

	public String getRecFisicosSalones() {
		return recFisicosSalones;
	}

	public void setRecFisicosSalones(String recFisicosSalones) {
		this.recFisicosSalones = recFisicosSalones;
	}

	public String getRecFisicosLaboratorios() {
		return recFisicosLaboratorios;
	}

	public void setRecFisicosLaboratorios(String recFisicosLaboratorios) {
		this.recFisicosLaboratorios = recFisicosLaboratorios;
	}

	public String getRecFisicosEspacios() {
		return recFisicosEspacios;
	}

	public void setRecFisicosEspacios(String recFisicosEspacios) {
		this.recFisicosEspacios = recFisicosEspacios;
	}

	public String getRecFisicosAudiovisuales() {
		return recFisicosAudiovisuales;
	}

	public void setRecFisicosAudiovisuales(String recFisicosAudiovisuales) {
		this.recFisicosAudiovisuales = recFisicosAudiovisuales;
	}

	public String getRecFisicosSalasSistemas() {
		return recFisicosSalasSistemas;
	}

	public void setRecFisicosSalasSistemas(String recFisicosSalasSistemas) {
		this.recFisicosSalasSistemas = recFisicosSalasSistemas;
	}

	public String getRecFisicosDeportes() {
		return recFisicosDeportes;
	}

	public void setRecFisicosDeportes(String recFisicosDeportes) {
		this.recFisicosDeportes = recFisicosDeportes;
	}

	public String getRecFisicosCulturales() {
		return recFisicosCulturales;
	}

	public void setRecFisicosCulturales(String recFisicosCulturales) {
		this.recFisicosCulturales = recFisicosCulturales;
	}

	public String getRecFisicosBiblioteca() {
		return recFisicosBiblioteca;
	}

	public void setRecFisicosBiblioteca(String recFisicosBiblioteca) {
		this.recFisicosBiblioteca = recFisicosBiblioteca;
	}

	public String getRecFisicosMediosComunicacion() {
		return recFisicosMediosComunicacion;
	}

	public void setRecFisicosMediosComunicacion(String recFisicosMediosComunicacion) {
		this.recFisicosMediosComunicacion = recFisicosMediosComunicacion;
	}

	public String getProyectoProductoDivulgar() {
		return proyectoProductoDivulgar;
	}

	public void setProyectoProductoDivulgar(String proyectoProductoDivulgar) {
		this.proyectoProductoDivulgar = proyectoProductoDivulgar;
	}

	public String getEstudiosPostGradoOtraUniversidad() {
		return estudiosPostGradoOtraUniversidad;
	}

	public void setEstudiosPostGradoOtraUniversidad(String estudiosPostGradoOtraUniversidad) {
		this.estudiosPostGradoOtraUniversidad = estudiosPostGradoOtraUniversidad;
	}

	public String getReconocimientoLaboral() {
		return reconocimientoLaboral;
	}

	public void setReconocimientoLaboral(String reconocimientoLaboral) {
		this.reconocimientoLaboral = reconocimientoLaboral;
	}

	public String getGrupoInvestigacion() {
		return grupoInvestigacion;
	}

	public void setGrupoInvestigacion(String grupoInvestigacion) {
		this.grupoInvestigacion = grupoInvestigacion;
	}

	public String getObservacionesProgramaEgresados() {
		return observacionesProgramaEgresados;
	}

	public void setObservacionesProgramaEgresados(String observacionesProgramaEgresados) {
		this.observacionesProgramaEgresados = observacionesProgramaEgresados;
	}

	public String getCompartirEstudiantesUniajc() {
		return compartirEstudiantesUniajc;
	}

	public void setCompartirEstudiantesUniajc(String compartirEstudiantesUniajc) {
		this.compartirEstudiantesUniajc = compartirEstudiantesUniajc;
	}

	public String getSugerenciasProgramaAcademico() {
		return sugerenciasProgramaAcademico;
	}

	public void setSugerenciasProgramaAcademico(String sugerenciasProgramaAcademico) {
		this.sugerenciasProgramaAcademico = sugerenciasProgramaAcademico;
	}

}
