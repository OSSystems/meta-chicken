SECTION = "devel/chicken"
DESCRIPTION = "SXML transformations ruleset library"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://sxml-fu.meta;md5=fb5d96b27a2e06f7d4a1a3cb6026becd"
DEPENDS_append_class-cross = " chicken-egg-sxml-transforms-cross chicken-egg-uri-common-cross chicken-egg-matchable-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-sxml-transforms-crosssdk chicken-egg-uri-common-crosssdk chicken-egg-matchable-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-sxml-transforms nativesdk-chicken-egg-uri-common nativesdk-chicken-egg-matchable chicken-egg-sxml-transforms-crosssdk chicken-egg-uri-common-crosssdk chicken-egg-matchable-crosssdk"
DEPENDS = " chicken-egg-sxml-transforms chicken-egg-uri-common chicken-egg-matchable chicken-egg-sxml-transforms-cross chicken-egg-uri-common-cross chicken-egg-matchable-cross chicken-egg-sxml-fu-cross"
RDEPENDS_${PN} = " chicken-egg-sxml-transforms chicken-egg-uri-common chicken-egg-matchable"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/sxml-fu/sxml-fu-${PV}.tar.gz"

SRC_URI[md5sum] = "a9b76cc4c77facdc761687b0b2a67dbe"
SRC_URI[sha256sum] = "a7913817673e146e3c95351230f1822771ea11ea5420aaa534ff679c8dcd298d"

S = "${WORKDIR}/sxml-fu-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
