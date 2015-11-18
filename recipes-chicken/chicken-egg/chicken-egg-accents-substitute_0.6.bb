SECTION = "devel/chicken"
DESCRIPTION = "Substitute accented characters in strings"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://accents-substitute.meta;md5=2c50d8abfbc6dc93d234681e235b59ab"
DEPENDS_append_class-cross = " chicken-egg-regex-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-regex-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-regex chicken-egg-regex-crosssdk"
DEPENDS = " chicken-egg-regex chicken-egg-regex-cross chicken-egg-accents-substitute-cross"
RDEPENDS_${PN} = " chicken-egg-regex"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/accents-substitute/accents-substitute-${PV}.tar.gz"

SRC_URI[md5sum] = "a1c8c75436c18419f850d070d432cff2"
SRC_URI[sha256sum] = "b729d9a597e453dec8227578465a92b14dfbec56452aff06c09272c2b6632f3c"

S = "${WORKDIR}/accents-substitute-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
