SECTION = "devel/chicken"
DESCRIPTION = "Homogeneous and heterogeneous arrays"
LICENSE = "Artistic-1.0"
LIC_FILES_CHKSUM = "file://srfi-63.meta;md5=519148dea50888f42a4a6e2e605d2610"
DEPENDS_append_class-cross = " chicken-egg-records-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-records-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-records chicken-egg-records-crosssdk"
DEPENDS = " chicken-egg-records chicken-egg-records-cross"
RDEPENDS_${PN} = " chicken-egg-records"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/srfi-63/srfi-63-${PV}.tar.gz"

SRC_URI[md5sum] = "7545598d6bee121ba27dee0a57a76de1"
SRC_URI[sha256sum] = "a4f7626ff67588a7981983921811e15fb23892cede3a1c73c05a220e75747730"

S = "${WORKDIR}/srfi-63-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
