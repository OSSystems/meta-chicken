SECTION = "devel/chicken"
DESCRIPTION = "Boxing"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://box.meta;md5=8ff4dd8b5d0c19ea930c33b8e9690880"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross chicken-egg-check-errors-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk chicken-egg-check-errors-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper nativesdk-chicken-egg-check-errors chicken-egg-setup-helper-crosssdk chicken-egg-check-errors-crosssdk"
DEPENDS = " chicken-egg-setup-helper chicken-egg-check-errors chicken-egg-setup-helper-cross chicken-egg-check-errors-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper chicken-egg-check-errors"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/box/box-${PV}.tar.gz"

SRC_URI[md5sum] = "a0dd8e7e9e4787cb2a9a0ab5fbcb9a73"
SRC_URI[sha256sum] = "9847e8fe2f211708c5505129fe23b8f8f47f3089dd91b7866aa0b919e3fa879d"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
