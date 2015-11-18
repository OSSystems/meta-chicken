SECTION = "devel/chicken"
DESCRIPTION = "Access the NeuroMorpho database."
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://neuromorpho.meta;md5=1ab809048a5916a8467b46df223ccd63"
DEPENDS_append_class-cross = " chicken-egg-regex-cross chicken-egg-matchable-cross chicken-egg-html-parser-cross chicken-egg-sxml-transforms-cross chicken-egg-sxpath-cross chicken-egg-uri-generic-cross chicken-egg-getopt-long-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-regex-crosssdk chicken-egg-matchable-crosssdk chicken-egg-html-parser-crosssdk chicken-egg-sxml-transforms-crosssdk chicken-egg-sxpath-crosssdk chicken-egg-uri-generic-crosssdk chicken-egg-getopt-long-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-regex nativesdk-chicken-egg-matchable nativesdk-chicken-egg-html-parser nativesdk-chicken-egg-sxml-transforms nativesdk-chicken-egg-sxpath nativesdk-chicken-egg-uri-generic nativesdk-chicken-egg-getopt-long chicken-egg-regex-crosssdk chicken-egg-matchable-crosssdk chicken-egg-html-parser-crosssdk chicken-egg-sxml-transforms-crosssdk chicken-egg-sxpath-crosssdk chicken-egg-uri-generic-crosssdk chicken-egg-getopt-long-crosssdk"
DEPENDS = " chicken-egg-regex chicken-egg-matchable chicken-egg-html-parser chicken-egg-sxml-transforms chicken-egg-sxpath chicken-egg-uri-generic chicken-egg-getopt-long chicken-egg-regex-cross chicken-egg-matchable-cross chicken-egg-html-parser-cross chicken-egg-sxml-transforms-cross chicken-egg-sxpath-cross chicken-egg-uri-generic-cross chicken-egg-getopt-long-cross"
RDEPENDS_${PN} = " chicken-egg-regex chicken-egg-matchable chicken-egg-html-parser chicken-egg-sxml-transforms chicken-egg-sxpath chicken-egg-uri-generic chicken-egg-getopt-long"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/neuromorpho/neuromorpho-${PV}.tar.gz"

SRC_URI[md5sum] = "79fe0715b33a4b57140ffb94085f708a"
SRC_URI[sha256sum] = "5d40c23252579708aba559a2fe5cfa559f3daf1a0b55664aa2f3f7000bd335d9"

S = "${WORKDIR}/neuromorpho-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
