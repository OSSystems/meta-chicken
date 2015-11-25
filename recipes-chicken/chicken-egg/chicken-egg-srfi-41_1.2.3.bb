SECTION = "devel/chicken"
DESCRIPTION = "SRFI 41 (Streams)"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://srfi-41.meta;md5=ef562537277af6531d2c819ec00a0345"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross chicken-egg-check-errors-cross chicken-egg-combinators-cross chicken-egg-record-variants-cross chicken-egg-numbers-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk chicken-egg-check-errors-crosssdk chicken-egg-combinators-crosssdk chicken-egg-record-variants-crosssdk chicken-egg-numbers-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper nativesdk-chicken-egg-check-errors nativesdk-chicken-egg-combinators nativesdk-chicken-egg-record-variants nativesdk-chicken-egg-numbers chicken-egg-setup-helper-crosssdk chicken-egg-check-errors-crosssdk chicken-egg-combinators-crosssdk chicken-egg-record-variants-crosssdk chicken-egg-numbers-crosssdk"
DEPENDS = " chicken-egg-setup-helper chicken-egg-check-errors chicken-egg-combinators chicken-egg-record-variants chicken-egg-numbers chicken-egg-setup-helper-cross chicken-egg-check-errors-cross chicken-egg-combinators-cross chicken-egg-record-variants-cross chicken-egg-numbers-cross chicken-egg-srfi-41-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper chicken-egg-check-errors chicken-egg-combinators chicken-egg-record-variants chicken-egg-numbers"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/srfi-41/srfi-41-${PV}.tar.gz"

SRC_URI[md5sum] = "a6e5719d079ef84c2de97584b4eda890"
SRC_URI[sha256sum] = "d5eb8d51cc2257c243a8ee9d167919b9b88e4b62b0f6b966ac7ef01dcab9897c"

S = "${WORKDIR}/srfi-41-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
