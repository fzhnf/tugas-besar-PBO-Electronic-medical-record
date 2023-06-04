package tubespbo.lembarkonsultasi.Model;

import java.util.Date;

public class ConsultationSheetModel {
    private int consultationSheetId;
    private Date createdAt;
    private int patientId;

    private int bloodPressuremmHg;
    private int heartRateBeatPerMinute;
    private int temperateCelcius;

    private int FeelingRate;
    private String physicalExaminationScript;
    private String diagnosisScript;
    private String patientEducation;

    public ConsultationSheetModel(int consultationSheetId, Date createdAt, int patientId, int bloodPressuremmHg, int heartRateBeatPerMinute, int temperateCelcius, int feelingRate, String physicalExaminationScript, String diagnosisScript, String patientEducation) {
        this.consultationSheetId = consultationSheetId;
        this.createdAt = createdAt;
        this.patientId = patientId;
        this.bloodPressuremmHg = bloodPressuremmHg;
        this.heartRateBeatPerMinute = heartRateBeatPerMinute;
        this.temperateCelcius = temperateCelcius;
        FeelingRate = feelingRate;
        this.physicalExaminationScript = physicalExaminationScript;
        this.diagnosisScript = diagnosisScript;
        this.patientEducation = patientEducation;
    }

    public int getConsultationSheetId() {
        return consultationSheetId;
    }

    public void setConsultationSheetId(int consultationSheetId) {
        this.consultationSheetId = consultationSheetId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public int getBloodPressuremmHg() {
        return bloodPressuremmHg;
    }

    public void setBloodPressuremmHg(int bloodPressuremmHg) {
        this.bloodPressuremmHg = bloodPressuremmHg;
    }

    public int getHeartRateBeatPerMinute() {
        return heartRateBeatPerMinute;
    }

    public void setHeartRateBeatPerMinute(int heartRateBeatPerMinute) {
        this.heartRateBeatPerMinute = heartRateBeatPerMinute;
    }

    public int getTemperateCelcius() {
        return temperateCelcius;
    }

    public void setTemperateCelcius(int temperateCelcius) {
        this.temperateCelcius = temperateCelcius;
    }

    public int getFeelingRate() {
        return FeelingRate;
    }

    public void setFeelingRate(int feelingRate) {
        FeelingRate = feelingRate;
    }

    public String getPhysicalExaminationScript() {
        return physicalExaminationScript;
    }

    public void setPhysicalExaminationScript(String physicalExaminationScript) {
        this.physicalExaminationScript = physicalExaminationScript;
    }

    public String getDiagnosisScript() {
        return diagnosisScript;
    }

    public void setDiagnosisScript(String diagnosisScript) {
        this.diagnosisScript = diagnosisScript;
    }

    public String getPatientEducation() {
        return patientEducation;
    }

    public void setPatientEducation(String patientEducation) {
        this.patientEducation = patientEducation;
    }

    @Override
    public String toString() {
        return "ConsultationSheetModel{" +
                "consultationSheetId=" + consultationSheetId +
                ", createdAt=" + createdAt +
                ", patientId=" + patientId +
                ", bloodPressuremmHg=" + bloodPressuremmHg +
                ", heartRateBeatPerMinute=" + heartRateBeatPerMinute +
                ", temperateCelcius=" + temperateCelcius +
                ", FeelingRate=" + FeelingRate +
                ", physicalExaminationScript='" + physicalExaminationScript + '\'' +
                ", diagnosisScript='" + diagnosisScript + '\'' +
                ", patientEducation='" + patientEducation + '\'' +
                '}';
    }
}