SECTION = "devel/chicken"
DESCRIPTION = "A tool to generate syntax diagrams (in SVG format) from BNF-esque grammars"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://banterpixra.meta;md5=900a9ae8beee06f20c5bc2122b60bae1"
DEPENDS_append_class-cross = " chicken-egg-sxpath-cross chicken-egg-matchable-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-sxpath-crosssdk chicken-egg-matchable-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-sxpath nativesdk-chicken-egg-matchable chicken-egg-sxpath-crosssdk chicken-egg-matchable-crosssdk"
DEPENDS = " chicken-egg-sxpath chicken-egg-matchable chicken-egg-sxpath-cross chicken-egg-matchable-cross"
RDEPENDS_${PN} = " chicken-egg-sxpath chicken-egg-matchable"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/banterpixra/banterpixra-${PV}.tar.gz"

SRC_URI[md5sum] = "31db805dd832aa0c84b9c1ef666737cc"
SRC_URI[sha256sum] = "ff588e8d1192d3e909dd77283336030e4edb776d6c7403fa6046ef8400a3baa9"

S = "${WORKDIR}/banterpixra-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
