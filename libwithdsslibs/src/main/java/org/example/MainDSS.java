package org.example;

import eu.europa.esig.dss.alert.StatusAlert;
import eu.europa.esig.dss.enumerations.DigestAlgorithm;
import eu.europa.esig.dss.enumerations.TokenExtractionStrategy;
import eu.europa.esig.dss.model.x509.CertificateToken;
import eu.europa.esig.dss.model.x509.revocation.crl.CRL;
import eu.europa.esig.dss.model.x509.revocation.ocsp.OCSP;
import eu.europa.esig.dss.spi.x509.CertificateSource;
import eu.europa.esig.dss.spi.x509.ListCertificateSource;
import eu.europa.esig.dss.spi.x509.aia.AIASource;
import eu.europa.esig.dss.spi.x509.revocation.RevocationSource;
import eu.europa.esig.dss.validation.CertificateValidator;
import eu.europa.esig.dss.validation.CertificateVerifier;
import eu.europa.esig.dss.validation.RevocationDataLoadingStrategyFactory;
import eu.europa.esig.dss.validation.RevocationDataVerifier;
import eu.europa.esig.dss.validation.reports.CertificateReports;

import java.math.BigInteger;
import java.security.*;
import java.security.cert.*;
import java.util.Date;
import java.util.Set;

public class MainDSS {
    public static void main(String[] args) {
        CertificateValidator validator = CertificateValidator.fromCertificate(new CertificateToken(new X509Certificate() {
            @Override
            public void checkValidity() throws CertificateExpiredException, CertificateNotYetValidException {

            }

            @Override
            public void checkValidity(Date date) throws CertificateExpiredException, CertificateNotYetValidException {

            }

            @Override
            public int getVersion() {
                return 0;
            }

            @Override
            public BigInteger getSerialNumber() {
                return null;
            }

            @Override
            public Principal getIssuerDN() {
                return null;
            }

            @Override
            public Principal getSubjectDN() {
                return null;
            }

            @Override
            public Date getNotBefore() {
                return null;
            }

            @Override
            public Date getNotAfter() {
                return null;
            }

            @Override
            public byte[] getTBSCertificate() throws CertificateEncodingException {
                return new byte[0];
            }

            @Override
            public byte[] getSignature() {
                return new byte[0];
            }

            @Override
            public String getSigAlgName() {
                return null;
            }

            @Override
            public String getSigAlgOID() {
                return null;
            }

            @Override
            public byte[] getSigAlgParams() {
                return new byte[0];
            }

            @Override
            public boolean[] getIssuerUniqueID() {
                return new boolean[0];
            }

            @Override
            public boolean[] getSubjectUniqueID() {
                return new boolean[0];
            }

            @Override
            public boolean[] getKeyUsage() {
                return new boolean[0];
            }

            @Override
            public int getBasicConstraints() {
                return 0;
            }

            @Override
            public byte[] getEncoded() throws CertificateEncodingException {
                return new byte[0];
            }

            @Override
            public void verify(PublicKey key) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {

            }

            @Override
            public void verify(PublicKey key, String sigProvider) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {

            }

            @Override
            public String toString() {
                return null;
            }

            @Override
            public PublicKey getPublicKey() {
                return new PublicKey() {
                    @Override
                    public String getAlgorithm() {
                        return "null";
                    }

                    @Override
                    public String getFormat() {
                        return "null";
                    }

                    @Override
                    public byte[] getEncoded() {
                        return new byte[0];
                    }
                };
            }

            public boolean hasUnsupportedCriticalExtension() {
                return false;
            }

            public Set<String> getCriticalExtensionOIDs() {
                return null;
            }

            public Set<String> getNonCriticalExtensionOIDs() {
                return null;
            }

            public byte[] getExtensionValue(String oid) {
                return new byte[0];
            }
        }));
        validator.setCertificateVerifier(new CertificateVerifier() {
            public RevocationSource<CRL> getCrlSource() {
                return null;
            }

            public void setCrlSource(RevocationSource<CRL> revocationSource) {

            }

            public RevocationSource<OCSP> getOcspSource() {
                return null;
            }

            public void setOcspSource(RevocationSource<OCSP> revocationSource) {

            }

            public RevocationDataLoadingStrategyFactory getRevocationDataLoadingStrategyFactory() {
                return null;
            }

            public void setRevocationDataLoadingStrategyFactory(RevocationDataLoadingStrategyFactory revocationDataLoadingStrategyFactory) {

            }

            public RevocationDataVerifier getRevocationDataVerifier() {
                return null;
            }

            public void setRevocationDataVerifier(RevocationDataVerifier revocationDataVerifier) {

            }

            public boolean isRevocationFallback() {
                return false;
            }

            public void setRevocationFallback(boolean b) {

            }

            public ListCertificateSource getTrustedCertSources() {
                return null;
            }

            public void setTrustedCertSources(CertificateSource... certificateSources) {

            }

            public void addTrustedCertSources(CertificateSource... certificateSources) {

            }

            public void setTrustedCertSources(ListCertificateSource listCertificateSource) {

            }

            public ListCertificateSource getAdjunctCertSources() {
                return null;
            }

            public void setAdjunctCertSources(CertificateSource... certificateSources) {

            }

            public void addAdjunctCertSources(CertificateSource... certificateSources) {

            }

            public void setAdjunctCertSources(ListCertificateSource listCertificateSource) {

            }

            public AIASource getAIASource() {
                return null;
            }

            public void setAIASource(AIASource aiaSource) {

            }

            public void setDefaultDigestAlgorithm(DigestAlgorithm digestAlgorithm) {

            }

            public DigestAlgorithm getDefaultDigestAlgorithm() {
                return null;
            }

            public void setAlertOnInvalidTimestamp(StatusAlert statusAlert) {

            }

            public StatusAlert getAlertOnInvalidTimestamp() {
                return null;
            }

            public void setAlertOnMissingRevocationData(StatusAlert statusAlert) {

            }

            public StatusAlert getAlertOnMissingRevocationData() {
                return null;
            }

            public void setAlertOnRevokedCertificate(StatusAlert statusAlert) {

            }

            public StatusAlert getAlertOnRevokedCertificate() {
                return null;
            }

            public void setAlertOnNoRevocationAfterBestSignatureTime(StatusAlert statusAlert) {

            }

            public StatusAlert getAlertOnNoRevocationAfterBestSignatureTime() {
                return null;
            }

            public void setAlertOnUncoveredPOE(StatusAlert statusAlert) {

            }

            public StatusAlert getAlertOnUncoveredPOE() {
                return null;
            }

            public void setAlertOnExpiredSignature(StatusAlert statusAlert) {

            }

            public StatusAlert getAlertOnExpiredSignature() {
                return null;
            }

            public void setCheckRevocationForUntrustedChains(boolean b) {

            }

            public boolean isCheckRevocationForUntrustedChains() {
                return false;
            }

            public void setExtractPOEFromUntrustedChains(boolean b) {

            }

            public boolean isExtractPOEFromUntrustedChains() {
                return false;
            }
        });
        validator.setTokenExtractionStrategy(TokenExtractionStrategy.EXTRACT_CERTIFICATES_AND_REVOCATION_DATA);
        CertificateReports certificateReports = validator.validate();
    }
}