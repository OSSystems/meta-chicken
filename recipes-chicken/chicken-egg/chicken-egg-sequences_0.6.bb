SECTION = "devel/chicken"
DESCRIPTION = "Generic sequence operators"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://sequences.meta;md5=b81234dd8712c6134ccae9f7b4fd5d00"
DEPENDS_append_class-cross = " chicken-egg-fast-generic-cross chicken-egg-srfi-42-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-fast-generic-crosssdk chicken-egg-srfi-42-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-fast-generic nativesdk-chicken-egg-srfi-42 chicken-egg-fast-generic-crosssdk chicken-egg-srfi-42-crosssdk"
DEPENDS = " chicken-egg-fast-generic chicken-egg-srfi-42 chicken-egg-fast-generic-cross chicken-egg-srfi-42-cross chicken-egg-sequences-cross"
RDEPENDS_${PN} = " chicken-egg-fast-generic chicken-egg-srfi-42"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/sequences/sequences-${PV}.tar.gz"

SRC_URI[md5sum] = "7f821c7bf8edaea2edf09ac616f7c44c"
SRC_URI[sha256sum] = "d6958383b611fd99f765d4a1236e7d13c85bbc1307f63846cd49dad3d9638a89"

S = "${WORKDIR}/sequences-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
