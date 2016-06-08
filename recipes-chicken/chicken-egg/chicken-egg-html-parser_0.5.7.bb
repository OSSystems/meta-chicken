SECTION = "devel/chicken"
DESCRIPTION = "A permissive, scalable HTML parser."
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://html-parser.meta;md5=fc996228a419c7f2f88801e2946cd4c6"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/html-parser/html-parser-${PV}.tar.gz"

SRC_URI[md5sum] = "1742628e86cac9433d40af7eb90fee74"
SRC_URI[sha256sum] = "456815e89f2d1f34e0db6953ef7da865b798f96bcb307c94509739d88827a9ce"

S = "${WORKDIR}/html-parser-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
