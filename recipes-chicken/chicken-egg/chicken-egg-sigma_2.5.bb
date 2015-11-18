SECTION = "devel/chicken"
DESCRIPTION = "An image gallery generator."
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://sigma.meta;md5=dd0be71181e8df3d6f6fd447db88e1d2"
DEPENDS_append_class-cross = " chicken-egg-regex-cross chicken-egg-matchable-cross chicken-egg-sxml-transforms-cross chicken-egg-utf8-cross chicken-egg-uri-generic-cross chicken-egg-fmt-cross chicken-egg-getopt-long-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-regex-crosssdk chicken-egg-matchable-crosssdk chicken-egg-sxml-transforms-crosssdk chicken-egg-utf8-crosssdk chicken-egg-uri-generic-crosssdk chicken-egg-fmt-crosssdk chicken-egg-getopt-long-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-regex nativesdk-chicken-egg-matchable nativesdk-chicken-egg-sxml-transforms nativesdk-chicken-egg-utf8 nativesdk-chicken-egg-uri-generic nativesdk-chicken-egg-fmt nativesdk-chicken-egg-getopt-long chicken-egg-regex-crosssdk chicken-egg-matchable-crosssdk chicken-egg-sxml-transforms-crosssdk chicken-egg-utf8-crosssdk chicken-egg-uri-generic-crosssdk chicken-egg-fmt-crosssdk chicken-egg-getopt-long-crosssdk"
DEPENDS = " chicken-egg-regex chicken-egg-matchable chicken-egg-sxml-transforms chicken-egg-utf8 chicken-egg-uri-generic chicken-egg-fmt chicken-egg-getopt-long chicken-egg-regex-cross chicken-egg-matchable-cross chicken-egg-sxml-transforms-cross chicken-egg-utf8-cross chicken-egg-uri-generic-cross chicken-egg-fmt-cross chicken-egg-getopt-long-cross"
RDEPENDS_${PN} = " chicken-egg-regex chicken-egg-matchable chicken-egg-sxml-transforms chicken-egg-utf8 chicken-egg-uri-generic chicken-egg-fmt chicken-egg-getopt-long"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/sigma/sigma-${PV}.tar.gz"

SRC_URI[md5sum] = "59147a687e2e3fe9a62c539047fd13c0"
SRC_URI[sha256sum] = "35de126b92a1d8e18cbfb340d6bcf546744a2670898d14792b6e7f04f0357006"

S = "${WORKDIR}/sigma-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
