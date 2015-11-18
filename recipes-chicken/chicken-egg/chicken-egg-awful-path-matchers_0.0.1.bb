SECTION = "devel/chicken"
DESCRIPTION = "Path matchers for awful"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://awful-path-matchers.meta;md5=5150aa631baa7363c5b66e352b98fa87"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/awful-path-matchers/awful-path-matchers-${PV}.tar.gz"

SRC_URI[md5sum] = "47c01c3e144beb9ed149864ed53926ae"
SRC_URI[sha256sum] = "5e510c96a02b0c35044ce54b86c620dbda7db2732687ef398c9b2ffede09ceda"

S = "${WORKDIR}/awful-path-matchers-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
