SECTION = "devel/chicken"
DESCRIPTION = "SDBM clone"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://sdbm.meta;md5=b0405d2152bc68973ef064a8687bf0e8"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/sdbm/sdbm-${PV}.tar.gz"

SRC_URI[md5sum] = "8c77729dc15dc31462f954bd36c3b607"
SRC_URI[sha256sum] = "45108763ac935d937cd89280dd289047321a7c3e445805a18a23fafd1b7fe1bb"

S = "${WORKDIR}/sdbm-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
