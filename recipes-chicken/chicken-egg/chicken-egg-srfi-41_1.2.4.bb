SECTION = "devel/chicken"
DESCRIPTION = "SRFI 41 (Streams)"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://srfi-41.meta;md5=dec1366ea0a15a582735465875cede42"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross chicken-egg-check-errors-cross chicken-egg-combinators-cross chicken-egg-record-variants-cross chicken-egg-numbers-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk chicken-egg-check-errors-crosssdk chicken-egg-combinators-crosssdk chicken-egg-record-variants-crosssdk chicken-egg-numbers-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper nativesdk-chicken-egg-check-errors nativesdk-chicken-egg-combinators nativesdk-chicken-egg-record-variants nativesdk-chicken-egg-numbers chicken-egg-setup-helper-crosssdk chicken-egg-check-errors-crosssdk chicken-egg-combinators-crosssdk chicken-egg-record-variants-crosssdk chicken-egg-numbers-crosssdk"
DEPENDS = " chicken-egg-setup-helper chicken-egg-check-errors chicken-egg-combinators chicken-egg-record-variants chicken-egg-numbers chicken-egg-setup-helper-cross chicken-egg-check-errors-cross chicken-egg-combinators-cross chicken-egg-record-variants-cross chicken-egg-numbers-cross chicken-egg-srfi-41-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper chicken-egg-check-errors chicken-egg-combinators chicken-egg-record-variants chicken-egg-numbers"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/srfi-41/srfi-41-${PV}.tar.gz"

SRC_URI[md5sum] = "1f72f126fa45b59d40db7074b8718e93"
SRC_URI[sha256sum] = "a9cca8ee14b32dcba9bb7a55d6ea6948a56afbbcca14a3e191303f41872e252d"

S = "${WORKDIR}/srfi-41-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
