SECTION = "devel/chicken"
DESCRIPTION = "Implementation of typed cells to replace general set! operators"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://cells.meta;md5=04bd592103905208788ea433269692af"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/cells/cells-${PV}.tar.gz"

SRC_URI[md5sum] = "8a9720f0ff84b2550d62fa444fe6ca8d"
SRC_URI[sha256sum] = "c40a14e8e2b9a36772ccbc65d38333d5813faf3ee452aab99f5ae31eb77e76c8"

S = "${WORKDIR}/cells-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
