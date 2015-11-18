SECTION = "devel/chicken"
DESCRIPTION = "Atom 1.0 feed reader and writer"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://atom.meta;md5=8907c8aa519dd1467951e328e76ed500"
DEPENDS_append_class-cross = " chicken-egg-matchable-cross chicken-egg-ssax-cross chicken-egg-sxml-serializer-cross chicken-egg-regex-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-matchable-crosssdk chicken-egg-ssax-crosssdk chicken-egg-sxml-serializer-crosssdk chicken-egg-regex-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-matchable nativesdk-chicken-egg-ssax nativesdk-chicken-egg-sxml-serializer nativesdk-chicken-egg-regex chicken-egg-matchable-crosssdk chicken-egg-ssax-crosssdk chicken-egg-sxml-serializer-crosssdk chicken-egg-regex-crosssdk"
DEPENDS = " chicken-egg-matchable chicken-egg-ssax chicken-egg-sxml-serializer chicken-egg-regex chicken-egg-matchable-cross chicken-egg-ssax-cross chicken-egg-sxml-serializer-cross chicken-egg-regex-cross"
RDEPENDS_${PN} = " chicken-egg-matchable chicken-egg-ssax chicken-egg-sxml-serializer chicken-egg-regex"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/atom/atom-${PV}.tar.gz"

SRC_URI[md5sum] = "7538a5d4d82830ab31ae929099761f3d"
SRC_URI[sha256sum] = "0639b1a93de05dee4121282c49401570ea0962c7596c5c1d2f2958e3c5c6e934"

S = "${WORKDIR}/atom-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
