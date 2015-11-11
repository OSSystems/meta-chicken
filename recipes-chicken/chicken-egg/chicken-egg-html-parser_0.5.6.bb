SECTION = "devel/chicken"
DESCRIPTION = "A permissive, scalable HTML parser."
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://html-parser.meta;md5=fc996228a419c7f2f88801e2946cd4c6"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/html-parser/html-parser-${PV}.tar.gz"

SRC_URI[md5sum] = "49491acf288361c9497da67aa2bfb9fd"
SRC_URI[sha256sum] = "c867ab7bc5cca7eea766feedbaa8790b7e9a3f309081a01c1d350a9deda55088"

S = "${WORKDIR}/html-parser-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
