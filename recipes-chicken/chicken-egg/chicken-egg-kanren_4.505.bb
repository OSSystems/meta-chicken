SECTION = "devel/chicken"
DESCRIPTION = "A declarative applicative logic programming system."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://kanren.meta;md5=a67e886797c02b73fb26caf35f245ef8"
DEPENDS_append_class-cross = " chicken-egg-make-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-make-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-make chicken-egg-make-crosssdk"
DEPENDS = " chicken-egg-make chicken-egg-make-cross"
RDEPENDS_${PN} = " chicken-egg-make"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/kanren/kanren-${PV}.tar.gz"

SRC_URI[md5sum] = "31950c49783793430997a88769c8f913"
SRC_URI[sha256sum] = "bd478d1a37500643f09e092c3ff3c9912d65f5ee49db9223eea99c310ab6510e"

S = "${WORKDIR}/kanren-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
